SUMMARY = "Tool to run Kubernetes locally"
DESCRIPTION = "Minikube is a tool that allows running Kubernetes locally. Minikube \
runs a single-node Kubernetes cluster inside a VM on your machine for \
users looking to try out Kubernetes or develop with it day-to-day."
LICENSE = "Apache-2.0"

PV = "1.38.1"

RPM_NAME = "minikube-1.38.1-1.3.aarch64.rpm"
RPM_HASH = "ad0a0d94e9cf00b5a8a8c9b0c4c96cd6eb1c539d2284ace7b468182c253fc77545036cfa9e0ad5fbb6998fe54c1950172671fb9314400f0a96e22de13fe7d00e"

RPROVIDES:${PN} += "minikube"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
