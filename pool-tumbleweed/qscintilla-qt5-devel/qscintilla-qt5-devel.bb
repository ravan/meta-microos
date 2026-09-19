SUMMARY = "C++ Editor Class Library Development Files"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class \
(http://www.scintilla.org/). \
 \
This package contains the development files for qscintilla-qt5-qt5."
LICENSE = "GPL-3.0-only"

PV = "2.14.1"

RPM_NAME = "qscintilla-qt5-devel-2.14.1-3.7.aarch64.rpm"
RPM_HASH = "80391d0c69588b455b8748e9cee332655ab58e114825c407a00d4f3b9c1685459d6b68fa90c0e7f01c91bc352c35c8237da5f20d5ce200c300d80cde1087e6a3"

RPROVIDES:${PN} += "libqscintilla-qt5-devel \
libqscintilla2-qt5-devel \
qscintilla-qt5-devel"

RDEPENDS:${PN} += "libqscintilla2-qt5-15 \
pkgconfig-Qt5Core \
pkgconfig-Qt5PrintSupport \
pkgconfig-Qt5Widgets"

inherit rpm
