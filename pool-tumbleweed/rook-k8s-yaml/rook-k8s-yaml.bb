SUMMARY = "Kubernetes YAML file manifests for deploying a Ceph cluster"
DESCRIPTION = "This package contains examples of yaml files required to deploy and run the \
Rook-Ceph operator and Ceph clusters in a Kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "1.6.2+git0.ge8fd65f08"

RPM_NAME = "rook-k8s-yaml-1.6.2+git0.ge8fd65f08-3.16.noarch.rpm"
RPM_HASH = "c995469eb3e23d452db9fa6f515c6ff8418ae81ddf6c8bbef228337e63c912b155f2eaaa97f124bc2c734d84151d3bf38b820fffebc823da5442fe378b374ac3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rook-k8s-yaml"

RDEPENDS:${PN} += ""

inherit rpm
