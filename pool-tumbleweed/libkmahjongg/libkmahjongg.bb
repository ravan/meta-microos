SUMMARY = "General Data for KDE Games"
DESCRIPTION = "Common code, backgrounds and tile sets for games using Mahjongg tiles."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libkmahjongg-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "4e45e1ae88b252f292487ece50c08a7182aef37695b3b0d6621956bd038c54f8a88b3cdd1cf7ff9cc59b01b6543ddaf3d89f699d143113861006c4f30f7d3928"

RPROVIDES:${PN} += "libkmahjongg \
libkmahjongg-kf5"

RDEPENDS:${PN} += ""

inherit rpm
