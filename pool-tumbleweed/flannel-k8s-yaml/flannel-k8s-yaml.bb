SUMMARY = "Kubernetes yaml file to run flannel container"
DESCRIPTION = "This package contains the yaml file requried to download and run the \
flannel container in a kubernetes cluster. \
 \
flannel is a virtual network that gives a subnet to each host for use with \
container runtimes. \
 \
Platforms like Google's Kubernetes assume that each container (pod) has a \
unique, routable IP address inside the cluster. The advantage of this model is that it \
reduces the complexity of doing port mapping."
LICENSE = "Apache-2.0"

PV = "0.28.7"

RPM_NAME = "flannel-k8s-yaml-0.28.7-1.2.noarch.rpm"
RPM_HASH = "8331ad80134ee2a37b1e9cf8943d98c64d03ebee8ff743fd9f8e86cc2f90ea4cf69294aa971204d14e5e42119753b08ba4d4e1dd71803a17a139b8ac0ff3fd5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flannel-k8s-yaml"

RDEPENDS:${PN} += ""

inherit rpm
