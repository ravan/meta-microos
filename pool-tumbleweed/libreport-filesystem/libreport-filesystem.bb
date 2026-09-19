SUMMARY = "Filesystem layout for libreport"
DESCRIPTION = "Filesystem layout for libreport"
LICENSE = "GPL-2.0-or-later"

PV = "2.17.15"

RPM_NAME = "libreport-filesystem-2.17.15-1.13.noarch.rpm"
RPM_HASH = "166109a19eb9d4c8ae9b51437ed494b6e107a577f26b367d413f9423b1e7f8ed909a95513eb795c8c6199fe329a03f6c3625a0243a9a9030ae1f24dc9e6bd2f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreport-filesystem"

RDEPENDS:${PN} += ""

inherit rpm
