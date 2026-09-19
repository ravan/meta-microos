SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.34.11"

RPM_NAME = "kubernetes1.34-proxy-1.34.11-2.1.aarch64.rpm"
RPM_HASH = "38307b1ab640a1535eedb56524d9f7d7c7b0a6e355e55ce319842a8bc194606d510e98d1d7900a86f45a70ec1412589394aa7ac09827c0a64a49e7aa77c20420"

RPROVIDES:${PN} += "kubernetes-proxy-provider \
kubernetes1.34-proxy"

RDEPENDS:${PN} += "conntrack-tools \
ebtables \
ipset \
iptables"

inherit rpm
