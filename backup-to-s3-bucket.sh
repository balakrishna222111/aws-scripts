backup_bucket_name="" ## Add the s3 bucket name 
backupfile_location=""  ## Add the backup location

upload_s3(){
    aws s3 cp $backupfile_location s3://$backup_bucket_name --recursive
}

upload_s3