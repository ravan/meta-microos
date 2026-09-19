SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This Qt 3D module contains functionality to support near-realtime \
simulation systems."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt53DQuickScene2D5-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "c201d4f4546bd97213f32924827271f14bc7c8e6b85599c8877509037190e12cc569ede4cf5d0b583145123ef2e03deee2c06dfa34880dcf51a67838b9c71e97"

RPROVIDES:${PN} += "libQt53DQuickScene2D.so.5 \
libQt53DQuickScene2D5 \
libscene2d.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt53DCore.so.5 \
libQt53DRender.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
