SUMMARY = "Provides insights into Kubernetes node and pod usage"
DESCRIPTION = "KubeNodeUsage is a Terminal App designed to provide insights into Kubernetes \
node and pod usage. It offers both interactive exploration and command-line \
filtering options to help you analyze your cluster effectively right from your \
terminal ."
LICENSE = "MIT"

PV = "3.0.4"

RPM_NAME = "KubeNodeUsage-3.0.4-1.8.aarch64.rpm"
RPM_HASH = "aa8fd3de090adadc997f449ef0358e6d39795f9bb56cf879d7543152f57c8b3759e25442fbfa95e391aad371a12469a7452e4d5efde474f23f452f2e0e36db04"

RPROVIDES:${PN} += "KubeNodeUsage"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
