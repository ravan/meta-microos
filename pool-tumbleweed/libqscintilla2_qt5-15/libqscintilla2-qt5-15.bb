SUMMARY = "C++ Editor Class Library"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class \
(http://www.scintilla.org/)."
LICENSE = "GPL-3.0-only"

PV = "2.14.1"

RPM_NAME = "libqscintilla2_qt5-15-2.14.1-3.7.aarch64.rpm"
RPM_HASH = "ed18e917d9525cfd6af97170fe2cadeae9b77133e5ce589ddd4edafad12e233c1420440f25eee9c7f7d5f0d884faea8352a5d688010a5ad441e24e015771da8c"

RPROVIDES:${PN} += "libqscintilla2-qt5-15 \
libqscintilla2-qt5.so.15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
qscintilla2-qt5"

inherit rpm
