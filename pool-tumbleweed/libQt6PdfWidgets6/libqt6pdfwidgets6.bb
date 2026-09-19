SUMMARY = "Qt6 PdfWidgets library"
DESCRIPTION = "The Qt6 PdfWidgets library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6PdfWidgets6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "5e6c5d2bf76efba58d62d4156d23a70d229dad88649fffbce58efbd64286c22375f75d8fed2862183bce2dd69dbaa4e597b4015d3bbe76676d6c0c59a73ff850"

RPROVIDES:${PN} += "libQt6PdfWidgets.so.6 \
libQt6PdfWidgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Pdf.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
