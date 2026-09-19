SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.35.8"

RPM_NAME = "kubernetes1.35-apiserver-1.35.8-2.1.aarch64.rpm"
RPM_HASH = "62ff44e0972aeb168c04c3b7c4a48ec9a5fd6276072d97938542e31f48424c4f147f577df7255654ac3e383e93cae599e5106deedccdd11e0b6723193c64eab0"

RPROVIDES:${PN} += "kubernetes-apiserver-provider \
kubernetes1.35-apiserver"

RDEPENDS:${PN} += ""

inherit rpm
