SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
Qt 3D provides functionality for near-realtime simulation \
systems with support for 2D and 3D rendering in both Qt C++ and Qt Quick applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt53DQuickInput5-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "221f4f741903e99802101ccfeb974850fe601f8b63fc5c2d0d32cfd504616e44144478940952ed2903f914cb602f68dff7d3a94bdcb3fa8cead2b402362ce3b7"

RPROVIDES:${PN} += "libQt53DQuickInput.so.5 \
libQt53DQuickInput5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt53DCore.so.5 \
libQt53DInput.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
