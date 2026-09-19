SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
Qt 3D provides functionality for near-realtime simulation \
systems with support for 2D and 3D rendering in both Qt C++ and Qt Quick applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt53DExtras5-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "1aeef9996e4ca78772c1da6f69e965fc8a4f1376fdd5371d42f67c56b4c6c1e289ce44ec6c32be3dc95b79bb3ed7775648ae0285cb2ecda3bcc7373c22e10a18"

RPROVIDES:${PN} += "libQt53DExtras.so.5 \
libQt53DExtras5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt53DCore.so.5 \
libQt53DInput.so.5 \
libQt53DLogic.so.5 \
libQt53DRender.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
