SUMMARY = "CLI for the kubeone cluster automation"
DESCRIPTION = "Kubermatic KubeOne automates cluster operations on all your cloud, on-prem, \
edge, and IoT environments. KubeOne can install high-available (HA) master \
clusters as well single master clusters."
LICENSE = "Apache-2.0"

PV = "1.14.3"

RPM_NAME = "kubeone-1.14.3-1.1.aarch64.rpm"
RPM_HASH = "fc8234f06960126d78e5a7f6e05d305d39c639f039249791d1f48887b3a538e335669b8e0d5000e336960b3d65e90fe6265f7cd5bad244180d9f17a2e57dfc4b"

RPROVIDES:${PN} += "kubeone"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
