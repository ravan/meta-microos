SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.37.0"

RPM_NAME = "kubernetes-apiserver-1.37.0-72.1.aarch64.rpm"
RPM_HASH = "d61f20f557b0f179f26709015e78148f8b5ccc4fcac1357413ea528d0470373259198550056ff6b3d5ed66625f3ed2a054d4567a094354ece8400d135f46cc73"

RPROVIDES:${PN} += "kubernetes-apiserver"

RDEPENDS:${PN} += "kubernetes1.37-apiserver"

inherit rpm
