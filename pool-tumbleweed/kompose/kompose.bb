SUMMARY = "Go from Docker Compose to Kubernetes"
DESCRIPTION = "kompose is a tool to help users who are familiar with docker-compose move to \
Kubernetes. kompose takes a Docker Compose file and translates it into \
Kubernetes resources. kompose is a convenience tool to go from local Docker \
development to managing your application with Kubernetes. Transformation of the \
Docker Compose format to Kubernetes resources manifest may not be exact, but it \
helps tremendously when first deploying an application on Kubernetes."
LICENSE = "Apache-2.0"

PV = "1.38.0"

RPM_NAME = "kompose-1.38.0-1.7.aarch64.rpm"
RPM_HASH = "ba132d8045bcd55b6052613cbe228bc84fcff4ad685ce2c602b43e0127e145736e35c28caa5babe77ce2b1500fee7bae318cf51d144ffd9e13334097fb7e2ffe"

RPROVIDES:${PN} += "kompose"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
