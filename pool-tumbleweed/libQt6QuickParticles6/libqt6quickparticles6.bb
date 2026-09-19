SUMMARY = "Qt 6 QuickParticles library"
DESCRIPTION = "The Qt 6 QuickParticles library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6QuickParticles6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "04b5fdbe70ef1350535c3bb9c09f4d0454cde69e2475f22bd496988beca25bd048b6fd4aa3990f429b1c03672a677f97ab4978c44be04c364e68b50047665b59"

RPROVIDES:${PN} += "libQt6QuickParticles.so.6 \
libQt6QuickParticles6"

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
