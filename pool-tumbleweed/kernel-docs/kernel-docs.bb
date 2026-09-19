SUMMARY = "Kernel Documentation"
DESCRIPTION = "A few basic documents from the current kernel sources. \
 \
Source Timestamp: 2026-09-12 06:50:42 +0000 \
GIT Revision: 6b7e8a968cce3b45e63d59e1d4981c9b7c5bc6b5 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "kernel-docs-7.2.5-1.1.noarch.rpm"
RPM_HASH = "50cd66245dfeb7324020fa4936a12001bed43497c46d85eeb8342001ac7b29328354b27ef6c3c8f2206bf3e52301a9a2d22c5bd981d1ab03011d2353b84b036f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-docs \
kernel-docs-srchash-6b7e8a968cce3b45e63d59e1d4981c9b7c5bc6b5"

RDEPENDS:${PN} += ""

inherit rpm
