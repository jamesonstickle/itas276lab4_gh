# Jameson Stickle - ITAS276 Lab 04

#### 1. What role does Jenkins play in a DevOps pipeline?
Jenkins is an automation server that allows devs to build, test, and deploy their software reliably. It is faster, more streamlined, and well integrated when compared to doing everything manually from the ground up. Jenkins Pipeline is a suite of tools or plugins that help a DevOps team to integrate continuous delivery pipelines into Jenkins.

By creating a Jenkinsfile and committing it to source control repo, a user can define the foundation of the pipeline and it can be versioned like any other code.
This creates a build process that all branches and pull requests can follow. Users can review code on the pipeline, and also have a trail they can audit. It also creates one "Single source of truth" so that all team members can view and edit the project.

Jenkins is open source, and can be used with almost any language that your system can use, as there are over 1800 plugins. Jenkins itself is distributed as WAR (Web Application Resource) files, which is a file used to distribute a collection of resource that constitute a web app (Java classes, HTML files, etc.)

Since it is open source, it can be used in almost any environment as well, from docker, to Windows, Mac, and most Unix based systems.

It is also completely free as well as being open-source.

It's easy to get started with Jenkins, but there is so much that can be done with I don't believe one could ever "master" Jenkins.

To summarize, Jenkins Pipeline is a very powerful tool that basically streamlines the automation process of CI/CD to improve workflow for a development team.

#### 2. Pros/Cons of MS Azure as a pipeline CI/CD tool:
##### Pros
- Great UI
- Works with any language, on any platform
- Deploys to different types of targets at the same time
- Integrates with Azure deployments
- Build on Windows, Mac, or Unix environments
- Integrates with GitHub
- Works with open-source projects
##### Cons
- Does not integrate easily with non-Microsoft tools
- Forced to use Azure workflow, can't make workflow more complex with things like if-else/switch case statements
- Deprecated tasks/extensions are not removed from the marketplace
- Documentation is not always up to date
#### 3. Pros/Cons of GitLab as a pipeline CI/CD tool:
##### Pros
- Easy config - can be installed anywhere (containers, on premises, cloud) - use CLI or GUI
- Secure - full distributed version control system platform - full control over who has access to the code and the storage location
- Automation - Includes a feature called Auto DevOps that automatically detects, builds, tests, deploys, and monitors applications via CI/CD pipeline
- DevOps score - gives teams a score that helps them gauge how they can extend DevOps capabilities to improve workflow and development process
- Scheduling - can schedule times for specific branches to be deployed, whether it is a specific time and date or a rolling release schedule.
- Free (with limitations, paid plans available)
- Open-source
- Allows self-hosting
- Well integrated with Git
##### Cons
- Interface may be slower than competition
- Common problems with repositories
- Not used by as many people as other tools, so support isn't quite as wide, but still heavily used.

#### 4. Can GitHub be used as a pipeline tool?
GitHub can be used as a pipeline tool using GitHub Actions, GitHub's own CI/CD platform. However it is in its infancy, only being released in 2019. An option such as Jenkins may be more tested and reliable.
#### 5. Class Tool Recommendation
If given the choice, I would use Jenkins. I prefer to use software that is free and open-source. That being said, I definitely do believe there would be a benefit learning on MS Azure/AWS, based on a lot of the job descriptions I have read it seems like something employers are looking for experience in.

##### Sources
[Using Jenkins](https://www.jenkins.io/doc/book/using/)
[Jenkins Pipeline](https://www.jenkins.io/doc/book/pipeline/)
[What is Azure Pipelines?](https://learn.microsoft.com/en-us/azure/devops/pipelines/get-started/what-is-azure-pipelines?view=azure-devops)
[Jenkins vs Azure](https://yml.co/pros-and-cons-of-jenkins-vs-azure-devops)
[GitLab Benefits](https://www.techtarget.com/searchsoftwarequality/video/5-advantages-of-GitLab-CI-CD-pipelines)
[GitHub vs GitLab](https://blog.desdelinux.net/en/github-vs-gitlab/#Desventajas)
[GitHub Actions](https://docs.github.com/en/actions)