"""***********************************************************
File: calculateTime.py
Instructor: Nguyen Thai
Date: 9/17/2023
Student: 
Description: 
    
    
***********************************************************"""
import time
import calendar

# Get current time in seconds since January 1, 1970
currentTimeInSeconds = calendar.timegm(time.localtime())

# Calculate the currentHour, currentMinute and currentSecond
# from currentTimeInSeconds using Python's numeric operators
# Print current time
print("currentTimeInSeconds is ", currentTimeInSeconds)
def convertSecondsToHourAndMinutes(seconds):
    seconds = seconds % (24 * 3600)
    currentHour = seconds // 3600
    seconds %= 3600
    currentMinute = seconds // 60
    seconds %= 60
    print("Current time is ", currentHour, ":", currentMinute, ":", seconds)

convertSecondsToHourAndMinutes(currentTimeInSeconds) 
