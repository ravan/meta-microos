SUMMARY = "Qt 6 RemoteObjects library"
DESCRIPTION = "The Qt 6 RemoteObjects library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6RemoteObjects6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "11b9d3c1db5ba9d9ee340af1f77ba2216aec9f0b9a1db253260e1671024f7bbd96aa6594ab920f04676dd8d666d6209fa6c95ce6c5f68f03f10460e5999ab916"

RPROVIDES:${PN} += "libQt6RemoteObjects.so.6 \
libQt6RemoteObjects6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
