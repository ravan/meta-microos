SUMMARY = "Python bindings for QScintilla for PyQt5"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class \
(http://www.scintilla.org/). \
 \
This package provides the Python bindings for QScintilla for PyQt5."
LICENSE = "GPL-3.0-only"

PV = "2.14.1"

RPM_NAME = "python314-qscintilla-qt5-2.14.1-3.7.aarch64.rpm"
RPM_HASH = "da88e88797ad2e1465b9b04418de191723efbb118b92bd2660f0aaa7c2c66ffe68f5e9066667a28fea453dc9eb66bf7363bf4fa1a99778077435da3188051092"

RPROVIDES:${PN} += "python3.14dist-qscintilla \
python314-qscintilla-qt5 \
python314-qscintilla-qt5-sip \
python3dist-qscintilla"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libqscintilla2-qt5.so.15 \
libstdc++.so.6 \
python-abi \
python314-PyQt5"

inherit rpm
