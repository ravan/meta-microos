SUMMARY = "Development package for kosmindoormap"
DESCRIPTION = "Development files for the KOSM and KOSMIndoorMap libraries."
LICENSE = "CC0-1.0 & LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kosmindoormap-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "566bd1b5b003c99ac9d50c3ece02d1a876abac585feaf19f85c9f3d348a4330557fc7176b3adb7921efbad1a33221aedc5f411807805990eec7d6485e10691b4"

RPROVIDES:${PN} += "cmake-KOSMIndoorMap \
kosmindoormap-devel"

RDEPENDS:${PN} += "libKOSM1 \
libKOSMIndoorMap1 \
libKOSMIndoorRouting1"

inherit rpm
