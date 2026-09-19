SUMMARY = "Qt 6 3dQuickLogic library"
DESCRIPTION = "The Qt 6 3dQuickLogic library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt63DQuickLogic6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "f741c54184d871b51862233334a264d6392915bc925e9c2cf3ffda9811d36884a6f91e8cb236b56f3101cdf15cb3a29c7eedc7eb9165fecd97538a7aa0244f91"

RPROVIDES:${PN} += "libQt63DQuickLogic.so.6 \
libQt63DQuickLogic6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt63DLogic.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
