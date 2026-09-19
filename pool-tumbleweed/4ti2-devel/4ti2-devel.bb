SUMMARY = "Development files for 4ti2"
DESCRIPTION = "This subpackage contains the include files and library links for \
developing against 4ti2's libraries."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.15"

RPM_NAME = "4ti2-devel-1.6.15-1.3.aarch64.rpm"
RPM_HASH = "f8822e5372a99d9e48d739b2385e3244872b656cbcf00af322bf5fa78741bc0312033d0291ba9a2773a1df5ce743310c886540c7aa158a35690c8ed320926f6a"

RPROVIDES:${PN} += "4ti2-devel"

RDEPENDS:${PN} += "lib4ti2-0 \
libzsolve0"

inherit rpm
