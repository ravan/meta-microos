SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.35.8"

RPM_NAME = "kubernetes-controller-manager-minus2-1.35.8-72.1.aarch64.rpm"
RPM_HASH = "d664eea1786eed2f874ea36088680239e7038f34f91e66fef3d75aa07cc60b8f84112f2dcec52cc7f32f26f125fa3cc409e4ad308747ce37e8f92439f991e88f"

RPROVIDES:${PN} += "kubernetes-controller-manager-minus2"

RDEPENDS:${PN} += "kubernetes1.35-controller-manager"

inherit rpm
