# break-even-mn-lambda
 
simple function written in kotlin via micronaut to deploy to AWS lambda

## Packages
- org.graalvm.nativeimage:svm
- io.micronaut:micronaut-runtime
- io.micronaut.aws:micronaut-function-aws

## Deployment

Running the deploy.sh script to generate a .zip file of the native image is the simplest way to deploy to aws.

.zip file contains the native image and a .bootstrap file and is located in the _build/libs_ subfolder.

- contents of function.zip using graalvm to create executable:
    - bootstrap
        ```bash 
        #!/bin/sh
        set -euo pipefail
        ./break-even-mn-lambda -Xmx512m
        ```
    - break-even-mn-lambda binary file
     
Manually upload this file to aws lambda and set runtime to custom runtime
dont forget to set the memory usage to at least 512MB as it will lead to errors otherwise

