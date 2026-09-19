SUMMARY = "GAP: Package for Mapping Class Orbit Computation"
DESCRIPTION = "The MapClass package calculates the mapping class group orbits for a \
given finite group."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "gap-mapclass-1.4.6-1.9.noarch.rpm"
RPM_HASH = "bb724dfb1625cb3eb869b26c602f8ccd235d29f090b243717ca0228d409d794186f95053689bc2baf67636dacdff22a3f89b587e96b162de8f7fb67cceb8d9b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-mapclass"

RDEPENDS:${PN} += "gap-core"

inherit rpm
