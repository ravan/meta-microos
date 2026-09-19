SUMMARY = "Kubernetes yaml file to run Multus containers"
DESCRIPTION = "Multus is a CNI plugin which provides multiple network interfaces in \
containers. It allows to use many CNI plugins at the same time and supports all \
plugins which implement the CNI specification. \
 \
This package contains the yaml file requried to download and run Multus \
containers in a Kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "3.6"

RPM_NAME = "multus-k8s-yaml-3.6-1.26.noarch.rpm"
RPM_HASH = "bfcf2917af84e155a4a16e788b9f5330b976cc83256508f1ec9bf349da9077650272eb82289b717e96d7e5f8ce862732a83263a72d8908a5cf7d2dd2a225e4d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "multus-k8s-yaml"

RDEPENDS:${PN} += ""

inherit rpm
