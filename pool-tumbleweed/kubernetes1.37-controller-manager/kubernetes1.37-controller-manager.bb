SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.37.0"

RPM_NAME = "kubernetes1.37-controller-manager-1.37.0-1.1.aarch64.rpm"
RPM_HASH = "449267e4f219ad6ffa829d01332aee3d9d8d063198cb2ab8a682d8ec0d1d078a87aa872a6ade239d2323bd3488da8ab50060a394cc611baf8b49099dbc34d7eb"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider \
kubernetes1.37-controller-manager"

RDEPENDS:${PN} += ""

inherit rpm
