SUMMARY = "Qt 6 QuickLayouts library"
DESCRIPTION = "The Qt 6 QuickLayouts library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6QuickLayouts6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "45d1af039196004a323a2769b8af8af0e6aab5975891307d644b339a697c03e155f4267793f7a9c69f5f2d6042ec791b0ab0fb352de33d3914099f3c19d81e58"

RPROVIDES:${PN} += "libQt6QuickLayouts.so.6 \
libQt6QuickLayouts6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
