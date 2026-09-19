SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.36.4"

RPM_NAME = "kubernetes1.36-controller-manager-1.36.4-2.1.aarch64.rpm"
RPM_HASH = "c53084829fd2915fedeecb595f4225c66dd333ffdd73c994a687f109be3624e33506bc21a2fa91c3d47714f872969721f2926c6e287fa945a99d631a03aa1ee3"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider \
kubernetes1.36-controller-manager"

RDEPENDS:${PN} += ""

inherit rpm
