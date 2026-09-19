SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This Qt 3D module contains functionality to support near-realtime \
simulation systems."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt53DQuickAnimation5-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "2999f42f7fd9e33d3a1357b89682d9c249275a09228d0b69683188051d7e64fca27870bb853642ef2e006941cdcd140584eb201718b63780fe4c7bbfccb93fd8"

RPROVIDES:${PN} += "libQt53DQuickAnimation.so.5 \
libQt53DQuickAnimation5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt53DAnimation.so.5 \
libQt53DCore.so.5 \
libQt53DRender.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
