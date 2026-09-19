SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.37.0"

RPM_NAME = "kubernetes-proxy-1.37.0-72.1.aarch64.rpm"
RPM_HASH = "c9d25e4d878adce0ea5d94053605f56c4f6848e309146bc176f8ff50f05d70ae45c4ef29b44afc57f435af0857a46eacacc5368076c526ec1182856ef7f6e81c"

RPROVIDES:${PN} += "kubernetes-proxy"

RDEPENDS:${PN} += "kubernetes1.37-proxy"

inherit rpm
