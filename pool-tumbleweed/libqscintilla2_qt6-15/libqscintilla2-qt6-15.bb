SUMMARY = "C++ Editor Class Library"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class \
(http://www.scintilla.org/)."
LICENSE = "GPL-3.0-only"

PV = "2.14.1"

RPM_NAME = "libqscintilla2_qt6-15-2.14.1-3.6.aarch64.rpm"
RPM_HASH = "fcd4fa5c8828e36540b101d893a67ffc571a8f330dc2562772a6eb8bc1dee614d7b6199425070faec429afcc120c9b78c0536d14220f0d42844b01ee2781a216"

RPROVIDES:${PN} += "libqscintilla2-qt6-15 \
libqscintilla2-qt6.so.15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
qscintilla2-qt6"

inherit rpm
