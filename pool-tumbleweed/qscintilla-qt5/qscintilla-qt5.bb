SUMMARY = "C++ Editor Class Library"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class for qt5 \
(http://www.scintilla.org/)."
LICENSE = "GPL-3.0-only"

PV = "2.14.1"

RPM_NAME = "qscintilla-qt5-2.14.1-3.7.aarch64.rpm"
RPM_HASH = "641e696392846e7ca1113c01cf493aa9cbb67f7ef2d331b015e54fe5821c2490fb87da3b233ad04fb43f9f73ca73d3417b870bf7611d73255d839c7675194e62"

RPROVIDES:${PN} += "libqscintillaplugin.so \
qscintilla-qt5 \
qscintilla2-qt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libqscintilla2-qt5.so.15 \
libstdc++.so.6"

inherit rpm
