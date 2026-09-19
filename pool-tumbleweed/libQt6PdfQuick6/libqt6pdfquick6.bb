SUMMARY = "Qt6 PdfQuick library"
DESCRIPTION = "The Qt6 PdfQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6PdfQuick6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "f983c6ffcdcc2c3c9c97b60918081fc99a547425d3e1f979d3313826158def4c5bb663f57ddba1bf6fd2a5a1592157f5f8ae4226a0485ae69b075407e5bed486"

RPROVIDES:${PN} += "libQt6PdfQuick.so.6 \
libQt6PdfQuick6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Pdf.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
