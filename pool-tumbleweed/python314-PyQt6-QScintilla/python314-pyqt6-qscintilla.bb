SUMMARY = "Python bindings for QScintilla for PyQt6"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class \
(http://www.scintilla.org/). \
 \
This package provides the Python bindings for QScintilla for PyQt6."
LICENSE = "GPL-3.0-only"

PV = "2.14.1"

RPM_NAME = "python314-PyQt6-QScintilla-2.14.1-3.6.aarch64.rpm"
RPM_HASH = "5e9a024f5d7cdcfdbed0f1de758d1d149c47b1e523b5a16874b3778e0cd4e288e7f351c2eae2347324e9406733789c7720837c2ffac2bfb260cc839f4be73ec6"

RPROVIDES:${PN} += "python3.14dist-pyqt6-qscintilla \
python314-PyQt6-QScintilla \
python314-qscintilla-qt6 \
python3dist-pyqt6-qscintilla"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libqscintilla2-qt6.so.15 \
libstdc++.so.6 \
python-abi \
python314-PyQt6"

inherit rpm
