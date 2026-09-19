SUMMARY = "Non-ABI stable API for the Qt 6 PdfWidgets library"
DESCRIPTION = "This package provides private headers of libQt6PdfWidgets that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-pdfwidgets-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "5f9dd7c798524a6ed24b33c84782155256b392f3c91927d1753b49228264a0bf8d26458ad2b920c0a0494e907bfe5ac731fe9cd89d99ee0fddd80f06125b680b"

RPROVIDES:${PN} += "cmake-Qt6PdfWidgetsPrivate \
qt6-pdfwidgets-private-devel"

RDEPENDS:${PN} += "cmake-Qt6PdfWidgets"

inherit rpm
