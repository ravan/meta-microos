SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
Qt 3D provides functionality for near-realtime simulation \
systems with support for 2D and 3D rendering in both Qt C++ and Qt Quick applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt53DCore5-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "3592521a9fb197b955d59d0248b3874d6b841e94a8ab85415cf968a23e59feefa39b07d0ea98237507aa8b57cb6d6f613f35d1ad240e757ff2a471d84714ace8"

RPROVIDES:${PN} += "libQt53DCore.so.5 \
libQt53DCore5 \
libQt53dCollision5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
