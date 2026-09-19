SUMMARY = "Qt 6 Svg library"
DESCRIPTION = "The Qt 6 Svg library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Svg6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "857b5826d842d712f65c06a9559299c8a63344c5383b01a23796f4a4deb63f59c145d59e464b31850a914d6cd9647d9edf31ef82ec188e846058dff3d7ad25b0"

RPROVIDES:${PN} += "libQt6Svg.so.6 \
libQt6Svg6 \
libqsvg.so \
libqsvgicon.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
