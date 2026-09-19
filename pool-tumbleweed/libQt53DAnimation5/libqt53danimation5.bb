SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This Qt 3D module contains functionality to support near-realtime \
simulation systems."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt53DAnimation5-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "5d8026dd21bc7ab72fe2d3b0012748bff423a566bf7af150dc7e91ed596731e03ec2b6bd88547205f9d8cb31dd61e23f02487436dbeb49645b0358658d538a66"

RPROVIDES:${PN} += "libQt53DAnimation.so.5 \
libQt53DAnimation5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt53DCore.so.5 \
libQt53DRender.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
