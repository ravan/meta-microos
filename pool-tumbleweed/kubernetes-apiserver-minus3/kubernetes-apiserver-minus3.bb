SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.34.11"

RPM_NAME = "kubernetes-apiserver-minus3-1.34.11-72.1.aarch64.rpm"
RPM_HASH = "bbe34d9c5d307a3931db8929aef9e44f2743760ec6e91adaf366ae2418435455fa6076757c97db5dc8de657eb1c10e7e2e265a52d5219e5b11874a21f1c20b82"

RPROVIDES:${PN} += "kubernetes-apiserver-minus3"

RDEPENDS:${PN} += "kubernetes1.34-apiserver"

inherit rpm
