SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.36.4"

RPM_NAME = "kubernetes1.36-client-1.36.4-2.1.aarch64.rpm"
RPM_HASH = "4d0047ac81940e26a2d360a8db8185cc806d4a22fa7176cc8582a1078967b80781939304b35bb831bc0b3a285d1ffa4839820fd581d3b895d725f1a3346b9f30"

RPROVIDES:${PN} += "kubernetes-client-provider \
kubernetes1.36-client"

RDEPENDS:${PN} += "kubernetes1.36-client-common \
update-alternatives"

inherit rpm
