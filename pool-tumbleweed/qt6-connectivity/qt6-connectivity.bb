SUMMARY = "Qt 6 connectivity tools and libraries"
DESCRIPTION = "Qt 6 connectivity tools and libraries."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-connectivity-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "86a173f3738f6c3dcdcd60fc9b8d8ed39f427fd6e54228554466f94467bf8aac80f68ece9f50ee460e04807a92e432834a6f2a43886e7e3922a2d1dcb77837a8"

RPROVIDES:${PN} += "qt6-connectivity"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libbluetooth.so.3 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
