SUMMARY = "Kubectl plugin to visualize network policies rules"
DESCRIPTION = "A kubectl plugin to visualize network policies rules."
LICENSE = "Apache-2.0"

PV = "1.0.8"

RPM_NAME = "kubectl-np-viewer-1.0.8-1.13.aarch64.rpm"
RPM_HASH = "ddb521dfacc8b483190383f0b47306c8a34caa61f98429a0626c240d269ddb6afa173d5b3a6f97758bbd87d11256f7044dbe7d8b37c510ae9b9e6c401f85d7b4"

RPROVIDES:${PN} += "kubectl-np-viewer"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
