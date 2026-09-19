SUMMARY = "BPF Compiler Collection documentation"
DESCRIPTION = "Documentation on how to write programs with the BPF Compiler Collection."
LICENSE = "Apache-2.0"

PV = "0.37.0"

RPM_NAME = "bcc-docs-0.37.0-4.1.noarch.rpm"
RPM_HASH = "032f4b5fc85d58a5747c7c7557f9b66982c1f3856e579502d384cd59a516c70c4b58aa8acb0ba54b02c23fe535c6bee8c9c26d61f3d970b864047954ce995dc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bcc-docs"

RDEPENDS:${PN} += ""

inherit rpm
