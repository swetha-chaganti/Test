# Integrate the test through Jenkins 
# Prerequites to be installed on your computer 
1.Jenkins
2.In case of Web apps all the required browsers 
# Congiguration:
1. Navigate to Jenkins plugin Manager and install supported plugins 
2. Once it is done restart jenkins server for changes to come into effect 
3. For tests to be able to simulate user actions on the UI, an interactive session must be opened on the test machine
4. Ensure that your Jenkins agent is set up to run in interactive mode. If the agent is running as a Windows application under a user account, you are good. However, if your Jenkins agent is running as a service, you need to configure it to run under the Local System User account and then open a user session via the plugin
5. Before we run our tests we need to place project to a location where Jenkins agents can access it
# Create Project
1.Now create new job in jenkins. Go to Advance option, and tick on Use custom workplace, and provide Selenium script project Directory path. 
2.Go to BUILD TAB, and Select the option “Execute Windows batch command” from Add build step drop down box. This option executes your build through Windows batch command
3.Give your batch file name in “Command” text box — “run.bat”
4.Click on Apply, and Save. Then, click on Build Now, and see the build result on console output.
# Running Nightly builds
Go to dashboard, and click on the Jenkins job, enter an item name, select project, and press OK button. Scroll General tab, and tick Build periodically checkbox under Build Triggers
