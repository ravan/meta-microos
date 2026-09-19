SUMMARY = "Management and troubleshooting tools for the Rook Ceph storage provider"
DESCRIPTION = "Provide common management and troubleshooting tools for the Rook Ceph storage \
provider as a kubectl plugin."
LICENSE = "Apache-2.0"

PV = "0.9.6"

RPM_NAME = "kubectl-rook-ceph-0.9.6-1.5.aarch64.rpm"
RPM_HASH = "682bf8144a9b6533b4468fc2cc29a676fbaba1dc5a6ea9982d5678774aee5456709fa303f38836f5f968add8be2185164bdb83c14bf14a71730bc2f40d09258d"

RPROVIDES:${PN} += "kubectl-rook-ceph"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
