SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.35.8"

RPM_NAME = "kubernetes1.35-controller-manager-1.35.8-2.1.aarch64.rpm"
RPM_HASH = "2cb75b04a314275b105218f09aa7619b64e06ce91a53fd8e6e37f17ea3247819d9a8a7e2d04a7eaa873025f231bf5aa2caf6710ae14818407f03c824048bc322"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider \
kubernetes1.35-controller-manager"

RDEPENDS:${PN} += ""

inherit rpm
