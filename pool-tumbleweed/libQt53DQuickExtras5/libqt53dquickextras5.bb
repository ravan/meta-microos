SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This Qt 3D module contains functionality to support near-realtime \
simulation systems."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt53DQuickExtras5-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "3169eb1b044a29ab5574d7f99055058961a89b9fccb2f00d237ff752669d045de24a2d6bb3b666613356edcd47d5ef6be9a1f4f3cd6701740b0c0b8c8be235eb"

RPROVIDES:${PN} += "libQt53DQuickExtras.so.5 \
libQt53DQuickExtras5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt53DCore.so.5 \
libQt53DExtras.so.5 \
libQt53DInput.so.5 \
libQt53DLogic.so.5 \
libQt53DQuick.so.5 \
libQt53DRender.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
