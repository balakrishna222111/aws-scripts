backup_bucket_name="" ## Add the s3 bucket name 
backupfile_location=""  ## Add the backup location
latestBackupFile=$(ls -t | head -1)

upload_s3(){
    aws s3 cp $backupfile_location/$latestBackupFile s3://$backup_bucket_name --recursive
}

upload_s3

echo $latestBackupFile