SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.37.0"

RPM_NAME = "kubernetes1.37-proxy-1.37.0-1.1.aarch64.rpm"
RPM_HASH = "cc29327ea6b7fb729b06eb3bbf15048a3b9805096fd7662da8de1b84fb74ee40c3861ea357a2c7b14051324d30f64149a30797792f71e2a4011138e390b14b0f"

RPROVIDES:${PN} += "kubernetes-proxy-provider \
kubernetes1.37-proxy"

RDEPENDS:${PN} += "conntrack-tools \
ebtables \
ipset \
iptables"

inherit rpm
