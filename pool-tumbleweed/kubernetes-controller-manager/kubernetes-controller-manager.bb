SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.37.0"

RPM_NAME = "kubernetes-controller-manager-1.37.0-72.1.aarch64.rpm"
RPM_HASH = "16dc1e637fd39541c955dcb5d3564a5647d1a4d353cf75cb28329d16d906a0c7cd59328a614a43716c8f91b4145c1b2b9b686b08e6653ce03f130ce18cb2b614"

RPROVIDES:${PN} += "kubernetes-controller-manager"

RDEPENDS:${PN} += "kubernetes1.37-controller-manager"

inherit rpm
