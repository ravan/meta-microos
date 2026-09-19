SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.36.4"

RPM_NAME = "kubernetes1.36-proxy-1.36.4-2.1.aarch64.rpm"
RPM_HASH = "206eb773e1dd9392fbc38ca663534586dbeab0880a6c509b4b193bd8086632e23dbfcd161acc4cbef80aebadb01723eb0e2aa5f74bdb8009152ee4c7bced5234"

RPROVIDES:${PN} += "kubernetes-proxy-provider \
kubernetes1.36-proxy"

RDEPENDS:${PN} += "conntrack-tools \
ebtables \
ipset \
iptables"

inherit rpm
