SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.34.11"

RPM_NAME = "kubernetes1.34-apiserver-1.34.11-2.1.aarch64.rpm"
RPM_HASH = "11db39e87cf36421431d26ee91e72ee4240867ecf8daa7821625e452738b520f905871f5760bb7bd749f036b55bd81ed437f0e347567b0d97135fcca841c51bd"

RPROVIDES:${PN} += "kubernetes-apiserver-provider \
kubernetes1.34-apiserver"

RDEPENDS:${PN} += ""

inherit rpm
