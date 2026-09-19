SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.37.0"

RPM_NAME = "kubernetes1.37-apiserver-1.37.0-1.1.aarch64.rpm"
RPM_HASH = "c8ee0b7e332dfcd5301d114b1f7ba98e3f480b92587b77c7da9f9d0bac312714345c4cbf99bb4e03f1e61cc4ed490cd8d4e0a2a3fe0027c25a52aecc49cd7817"

RPROVIDES:${PN} += "kubernetes-apiserver-provider \
kubernetes1.37-apiserver"

RDEPENDS:${PN} += ""

inherit rpm
