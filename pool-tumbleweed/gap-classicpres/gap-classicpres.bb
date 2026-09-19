SUMMARY = "GAP: Classical Group Presentations"
DESCRIPTION = "This GAP module is a translation of the `ClassicalStandardPresentation` \
code from Magma."
LICENSE = "GPL-2.0 | GPL-3.0"

PV = "1.22"

RPM_NAME = "gap-classicpres-1.22-2.5.noarch.rpm"
RPM_HASH = "2182abb50b49dee4821f44105643e41ef7badb43d1fa4ebb0ba6981aa3c41e3239454873833797fc98221edd860a6f1117b6a4a27b12d34e8d095dbd96178bee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-classicpres"

RDEPENDS:${PN} += "gap-atlasrep \
gap-core"

inherit rpm
