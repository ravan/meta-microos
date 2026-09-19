SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.34.11"

RPM_NAME = "kubernetes-controller-manager-minus3-1.34.11-72.1.aarch64.rpm"
RPM_HASH = "cd1d058cc7a5d6a6f0cac351fa405979ae00368c13cbc7c4b1a53f390f01a69d85835994afc442280d4f50afac2fc68efe430cc620c3f90864c23e0fe96acc0b"

RPROVIDES:${PN} += "kubernetes-controller-manager-minus3"

RDEPENDS:${PN} += "kubernetes1.34-controller-manager"

inherit rpm
