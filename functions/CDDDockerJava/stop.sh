#!/usr/bin/env bash

CORE=$1
NAME=$2

if [ -z "$CORE" ]; then
  echo 'You must specify the full name of the core (including the "_Core" suffix if you used GGP to build this deployment) as the first parameter to this script'
  exit 1
fi

if [ -z "$NAME" ]; then
  echo 'You must specify the repo tag of the container you want to stop (e.g. "hello-world") or the container ID as the second and final parameter to this script'
  exit 1
fi

aws iot-data publish --topic $CORE/cdd/docker/request --payload "{\"type\":\"STOP\", \"name\":\"$NAME\"}"
