param(
    [Parameter(Mandatory = $true, Position = 0)]
    [string]$Source,

    [Parameter(ValueFromRemainingArguments = $true)]
    [string[]]$ProgramArgs
)

$sourcePath = (Resolve-Path -LiteralPath $Source -ErrorAction Stop).Path
$repoRoot = $PSScriptRoot.TrimEnd('\', '/')
$repoPrefix = $repoRoot + [System.IO.Path]::DirectorySeparatorChar

if (-not $sourcePath.StartsWith($repoPrefix, [System.StringComparison]::OrdinalIgnoreCase)) {
    throw 'The Java file must be inside this repository.'
}
if ([System.IO.Path]::GetExtension($sourcePath) -ne '.java') {
    throw 'Choose a .java source file.'
}
if ((Get-Item -LiteralPath $sourcePath).Length -eq 0) {
    throw 'This lesson is an empty draft. Write a main method before running it.'
}

$relativePath = $sourcePath.Substring($repoPrefix.Length)
$className = [System.IO.Path]::GetFileNameWithoutExtension($sourcePath)
$outputPath = Join-Path (Join-Path $repoRoot '.build') $relativePath.Substring(0, $relativePath.Length - 5)
New-Item -ItemType Directory -Path $outputPath -Force | Out-Null

& javac -d $outputPath $sourcePath
if ($LASTEXITCODE -ne 0) { exit $LASTEXITCODE }

& java -cp $outputPath $className @ProgramArgs
exit $LASTEXITCODE
