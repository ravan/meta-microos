SUMMARY = "The official CLI for Amazon EKS"
DESCRIPTION = "eksctl is a simple CLI tool for creating clusters on EKS - Amazon's new managed \
Kubernetes service for EC2. It is written in Go, and uses CloudFormation. \
 \
You can create a cluster in minutes with just one command – eksctl create \
cluster!"
LICENSE = "Apache-2.0"

PV = "0.230.0"

RPM_NAME = "eksctl-0.230.0-1.1.aarch64.rpm"
RPM_HASH = "910a0959ee09b800b20028dbad4dedc11b2a0b73630bc5fd54fcd040e2e94e15e81a6bb87ccc931e248a2b64cb4804b72806289e3f0af075e9f56d71fd05adf3"

RPROVIDES:${PN} += "eksctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
