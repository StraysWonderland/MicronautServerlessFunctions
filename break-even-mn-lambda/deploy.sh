#!/bin/bash
docker build . -t break-even-mn-lambda
mkdir -p build
docker run --rm --entrypoint cat break-even-mn-lambda  /home/application/function.zip > build/function.zip
