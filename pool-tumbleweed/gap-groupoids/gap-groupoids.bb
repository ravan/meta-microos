SUMMARY = "GAP: Groupoids, graphs of groups, and graphs of groupoids"
DESCRIPTION = "This package allows for the computation of finite groupoids, both \
connected and with several components. Graphs of groups and graphs of \
groupoids are also constructed, allowing the calculation of normal \
forms for Free Products with Amalgamation and for HNN extensions when \
the initial groups have rewriting systems."
LICENSE = "GPL-2.0-or-later"

PV = "1.84"

RPM_NAME = "gap-groupoids-1.84-1.1.noarch.rpm"
RPM_HASH = "6e92fbcc4b4d8da1b0b5e63274b04c3ba27a6e2130e07f44e9161d13788cebe2691c11dc7b13b723c0ff17ae9e08a51efe5b7fed2ec5b2ff131bfdaea5422b9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-groupoids"

RDEPENDS:${PN} += "gap-core \
gap-fga \
gap-utils"

inherit rpm
