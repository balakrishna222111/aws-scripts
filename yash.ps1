$CurrrentDirectory = $(Get-Location)

$jsonPath = "$CurrrentDirectory/appsettings.json"

$json = Get-Content $jsonPath -raw | ConvertFrom-Json

foreach($each in $json){
    Write-Host "each is :$each" | ConvertFrom-Json
}

