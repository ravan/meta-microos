SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.36.4"

RPM_NAME = "kubernetes-controller-manager-minus1-1.36.4-72.1.aarch64.rpm"
RPM_HASH = "958367440dfe1c2c5e46eef7fe6b127a4fa4fc3da8ddeaabaa2a3b6473bc184011254f25c9aad19a0005531b6d8f8f17cee7ecabd1f6f07f51d7b13cfd3289c8"

RPROVIDES:${PN} += "kubernetes-controller-manager-minus1"

RDEPENDS:${PN} += "kubernetes1.36-controller-manager"

inherit rpm
