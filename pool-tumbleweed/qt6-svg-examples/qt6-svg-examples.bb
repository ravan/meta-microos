SUMMARY = "Examples for the qt6-svg modules"
DESCRIPTION = "Examples for the qt6-svg modules."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-svg-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "39148203ccf34585f865678a04b6b3949b69feb4984f011624b46fbf61030b76023112088d818603f7ef5aa676353c3f524d64f390112f5d9ba2908335a594de"

RPROVIDES:${PN} += "qt6-svg-examples"

RDEPENDS:${PN} += ""

inherit rpm
