SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.34.11"

RPM_NAME = "kubernetes-proxy-minus3-1.34.11-72.1.aarch64.rpm"
RPM_HASH = "d3b89d3c409d883da7a08395c7bc0bc55d328af379a0532c058b7ba063cf75d47fd5d25823d36e3d5ef9bc3cfad67e2dc2a82c43404aa862e5de1721b1fa0d35"

RPROVIDES:${PN} += "kubernetes-proxy-minus3"

RDEPENDS:${PN} += "kubernetes1.34-proxy"

inherit rpm
