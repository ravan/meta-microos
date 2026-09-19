SUMMARY = "Kernel Documentation (HTML)"
DESCRIPTION = "These are HTML documents built from the current kernel sources. \
 \
Source Timestamp: 2026-09-12 06:50:42 +0000 \
GIT Revision: 6b7e8a968cce3b45e63d59e1d4981c9b7c5bc6b5 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "kernel-docs-html-7.2.5-1.1.noarch.rpm"
RPM_HASH = "eaea54f1146dae25f9f633eb8d6d8f8b2e528c316164418787acabf7bf907b7faa4c62c3902e03979ea32bed269690ecd11b4758be6cd7d33e417a1e3b896ec8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
