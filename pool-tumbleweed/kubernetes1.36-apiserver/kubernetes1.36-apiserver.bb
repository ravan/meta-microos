SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.36.4"

RPM_NAME = "kubernetes1.36-apiserver-1.36.4-2.1.aarch64.rpm"
RPM_HASH = "922f12207b4b395ae38ce0c2392b7a4c596f40961e8dbccd8952151f85e65deb0dd5815f4f22269ff5f4055880491a94b964fc5dd076a259eb2bd1d4af74fa09"

RPROVIDES:${PN} += "kubernetes-apiserver-provider \
kubernetes1.36-apiserver"

RDEPENDS:${PN} += ""

inherit rpm
