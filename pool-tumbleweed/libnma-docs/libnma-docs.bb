SUMMARY = "Documentation files for libnma"
DESCRIPTION = "Documentation files for libnma."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.6"

RPM_NAME = "libnma-docs-1.10.6-3.12.noarch.rpm"
RPM_HASH = "4814bb28067487e7ae84350274db63f3e809301efa6fa1837fb0bd2ed44d32f3551473165432773642a02f956719f485845ca45609423fe26a1194d922473639"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libnma-docs"

RDEPENDS:${PN} += ""

inherit rpm
