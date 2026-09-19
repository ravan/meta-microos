SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.35.8"

RPM_NAME = "kubernetes1.35-proxy-1.35.8-2.1.aarch64.rpm"
RPM_HASH = "8ced0fb67db13f6ff4aff939e43ce825bcbe405c439b7cb792663b348bc56a183a5377ec221ca71269dbbb50245bed84b5142917768393a296d98c5c7ab2836f"

RPROVIDES:${PN} += "kubernetes-proxy-provider \
kubernetes1.35-proxy"

RDEPENDS:${PN} += "conntrack-tools \
ebtables \
ipset \
iptables"

inherit rpm
