# MicronautServerlessFunctions

Projects that use micronaut and the corresponding serverless plattforms packages to directly deploy to aws lambda or azure.
This Repo serves to test the development and deployment workflow with micronaut.

## AWS Lambda Project

### Packages
- micronaut-lambda
- micronaut-lambda-custom-runtime
- micronaut-graalvm


### Deployment

Generate a jar file by running the corresponding gradle/maven task

> Optional:
>  
> if you want to deploy a graalvm native image you require the *deploy.sh* script and the *dockerfile* provided by the micronaut graalvm example projects and run the deploy.sh 

Upload the jar or zip file to aws lambda manually or define a terraform script

## Azure Project

The micronaut azure package allows to run the code locally for testing, package into zip file, or deploy directly to azure

### Packages
- micronaut-azure
- graalvm

### Development and Deployment

The micronaut azure packages provide gradle/maven tasks for running and testing locally, as well as deploying to azure.
This requires configuring your deployment
Also, when developing with **VS CODE**, you can use the **azure integration** to run locally and deploy directly to any specific azure subscription and function by selecting it via the provided GUI.
