SUMMARY = "Development files for the Qt 6 PdfWidgets library"
DESCRIPTION = "Development files for the Qt 6 PdfWidgets library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-pdfwidgets-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "1039f5435abe3e17c59e9b3a007afb40b47ea45f2dceaa7f9ac23fec595c2033cc2431ccd4f7436f52abdf46d9e14bbe6117c64faf1901640f3dda6345fa186d"

RPROVIDES:${PN} += "cmake-Qt6PdfWidgets \
pkgconfig-Qt6PdfWidgets \
qt6-pdfwidgets-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Pdf \
cmake-Qt6Widgets \
libQt6PdfWidgets6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Pdf \
pkgconfig-Qt6Widgets"

inherit rpm
