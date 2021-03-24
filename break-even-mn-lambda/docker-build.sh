#!/bin/sh
docker build . -t break-even-mn-lambda
echo "To run the docker container execute:"
echo "    $ docker run -p 8080:8080 break-even-mn-lambda"
