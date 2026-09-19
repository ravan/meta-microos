SUMMARY = "Development files for filezilla"
DESCRIPTION = "This are development files for filezilla."
LICENSE = "GPL-2.0-or-later"

PV = "3.71.1"

RPM_NAME = "filezilla-devel-3.71.1-1.1.aarch64.rpm"
RPM_HASH = "7924b6e43cf7d8d7f3cdbfa43f0b5dc5173d8d57e0b914745f0881350c9e2706b2bf5cdf813879464de15279328ed996374a4c9dac51f2d902a0f7785fe97f95"

RPROVIDES:${PN} += "filezilla-devel"

RDEPENDS:${PN} += "filezilla"

inherit rpm
