SUMMARY = "C++ Editor Class Library"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class for qt6 \
(http://www.scintilla.org/)."
LICENSE = "GPL-3.0-only"

PV = "2.14.1"

RPM_NAME = "qscintilla-qt6-2.14.1-3.6.aarch64.rpm"
RPM_HASH = "b1294c88a6d85876aeda2e0d7782a8e2a9007d4efbc785db90a7139fb1c08c74421da712780cfef80263c73dfda1c8e9e30921feaba0d8db465229533d5c58ea"

RPROVIDES:${PN} += "libqscintillaplugin.so \
qscintilla-qt6 \
qscintilla2-qt6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libqscintilla2-qt6.so.15 \
libstdc++.so.6"

inherit rpm
