SUMMARY = "Python bindings for QScintilla for PyQt6"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class \
(http://www.scintilla.org/). \
 \
This package provides the Python bindings for QScintilla for PyQt6."
LICENSE = "GPL-3.0-only"

PV = "2.14.1"

RPM_NAME = "python313-PyQt6-QScintilla-2.14.1-3.6.aarch64.rpm"
RPM_HASH = "4bc600410fccd020c0c7351a6d933f83157eb3313effff1d348b2974565920d545d5a2c0aef31a594f86020b30f9d6b5996885383e20d3a8000a079799cad456"

RPROVIDES:${PN} += "python3-PyQt6-QScintilla \
python3-qscintilla-qt6 \
python3.13dist-pyqt6-qscintilla \
python313-PyQt6-QScintilla \
python313-qscintilla-qt6 \
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
python313-PyQt6"

inherit rpm
