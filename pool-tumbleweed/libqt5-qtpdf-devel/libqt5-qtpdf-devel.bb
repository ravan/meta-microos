SUMMARY = "Development files for the Qt5 PDF library"
DESCRIPTION = "You need this package if you want to compile programs with Qt PDF."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.19"

RPM_NAME = "libqt5-qtpdf-devel-5.15.19-3.3.aarch64.rpm"
RPM_HASH = "0dda2710215b5b6909770425b7e557a0513204cd5c22398edff7a38376b0c5836261cc07f1c98e9a1685d1c02e9c19b543a6ab20e3f4ccdb10c138ed2a21bf99"

RPROVIDES:${PN} += "cmake-Qt5Pdf \
cmake-Qt5PdfWidgets \
libqt5-qtpdf-devel \
pkgconfig-Qt5Pdf \
pkgconfig-Qt5PdfWidgets"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Pdf5 \
libQt5PdfWidgets5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Pdf \
pkgconfig-Qt5Widgets"

inherit rpm
