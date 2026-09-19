SUMMARY = "qpdfview plugin: PDF documents"
DESCRIPTION = "This plugin is required to read PDF documents \
(*.pdf files) with the qpdfview document viewer."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "qpdfview-plugin-pdf-0.5.0-4.5.aarch64.rpm"
RPM_HASH = "500b04165d28345466f6d497c956e2ef0affa252b55e98efa551e8aba88a39ab00a71f1df2e69e1259110c69bf991c90701c340f81e32f362294f9dc8d2bc00d"

RPROVIDES:${PN} += "libqpdfview-pdf.so \
qpdfview-plugin-pdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libpoppler-qt6.so.3 \
libstdc++.so.6 \
qpdfview"

inherit rpm
