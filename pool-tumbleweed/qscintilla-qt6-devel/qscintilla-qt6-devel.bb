SUMMARY = "C++ Editor Class Library Development Files"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class \
(http://www.scintilla.org/). \
 \
This package contains the development files for qscintilla-qt6."
LICENSE = "GPL-3.0-only"

PV = "2.14.1"

RPM_NAME = "qscintilla-qt6-devel-2.14.1-3.6.aarch64.rpm"
RPM_HASH = "ff73c68d07d5724042c76da3d92158a071dd394680b95d2e19d792b974a1f7f1a6b4fc72ee45fbd62b6c1509d6958c3b47ac1745e677943cd40a8813f9554c18"

RPROVIDES:${PN} += "libqscintilla-qt6-devel \
libqscintilla2-qt6-devel \
qscintilla-qt6-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
cmake-Qt6PrintSupport \
cmake-Qt6Widgets \
libqscintilla2-qt6-15"

inherit rpm
