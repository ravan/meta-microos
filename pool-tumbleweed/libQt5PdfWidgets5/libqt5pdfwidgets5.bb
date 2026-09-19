SUMMARY = "Qt5 PDF library for Qt Widgets"
DESCRIPTION = "Library of the Qt PDF module with support for Qt Widgets."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.19"

RPM_NAME = "libQt5PdfWidgets5-5.15.19-3.3.aarch64.rpm"
RPM_HASH = "7b6295d8f2fee09b714e0e514a5f1c828693d0dc3e87c6d6278e5998f98ec759375cc32a427995a8cd2f131d24082a277efd2a80d2b83c2606b146d94384a4de"

RPROVIDES:${PN} += "libQt5PdfWidgets.so.5 \
libQt5PdfWidgets5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Pdf.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
