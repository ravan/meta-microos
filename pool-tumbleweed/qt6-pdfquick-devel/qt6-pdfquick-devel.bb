SUMMARY = "Development files for the Qt 6 PdfQuick library"
DESCRIPTION = "Development files for the Qt 6 PdfQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-pdfquick-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "7e0f26c2ade4c997b0eac512ccb48cdf349c73d639e5dad94491d2ec9d9cf94e70f1d474ce2df9479af02a1146bd49cc7e3254261ec36dc8180e56fad4b84056"

RPROVIDES:${PN} += "cmake-Qt6PdfQuick \
pkgconfig-Qt6PdfQuick \
qt6-pdfquick-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6PdfPrivate \
cmake-Qt6Qml \
cmake-Qt6Quick \
libQt6PdfQuick6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Pdf \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
qt6-quick-private-devel"

inherit rpm
