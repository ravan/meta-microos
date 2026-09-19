SUMMARY = "Documentation for libamd"
DESCRIPTION = "Documentation for libamd."
LICENSE = "BSD-3-Clause"

PV = "7.14.0"

RPM_NAME = "libamd-doc-7.14.0-1.1.noarch.rpm"
RPM_HASH = "d51ba1dd62992639cdc5ba08dfd23c2ba910c1df81e920fde1c521917553ddfeca15a1e43480afcf65cbdee85e556dec5401d568c51741a33ebaf616df01a2e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libamd-doc"

RDEPENDS:${PN} += ""

inherit rpm
