# Integrate the test through Jenkins 
# Prerequites to be installed on your computer 
1.Jenkins
2.In case of Web apps all the required browsers 
# Configuration:
1. Navigate to Jenkins plugin Manager and install supported plugins 
2. Once it is done restart jenkins server for changes to come into effect 
3. In Build – click on Add build step and choose Invoke top-level Maven targets and pass ‘clean install‘ as Goals. Click on Advanced button and pass POM value as ‘pom.xml‘
# Create Project
1.Now create new job in jenkins. Go to Advance option, and tick on Use custom workplace, and provide Selenium script project Directory path. 
2.Go to BUILD TAB, and Select the option “Execute Windows batch command” from Add build step drop down box. This option executes your build through Windows batch command
3.Give your batch file name in “Command” text box — “run.bat”
4.Click on Apply, and Save. Then, click on Build Now, and see the build result on console output.
5.Also, you could pass Post-build actions to generate reports. To generate TestNG HTML reports, choose Publish reports by clicking on Add post-build action and pass value as ‘**/testng-results.xml‘
# For scheduling Jenkins job:
Open your Jenkins job – Configure – Build triggers – Select Build periodically checkbox and enter your Cron job pattern
Example: To run your job every minute, you need to enter * * * * *
# For sending Email Notifications 
Go to Manage Jenkins – Configure – Select Email notification – Set SMTP configuration.
You will receive an email notification whenever the build passes or fails
