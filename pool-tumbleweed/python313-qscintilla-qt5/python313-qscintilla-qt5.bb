SUMMARY = "Python bindings for QScintilla for PyQt5"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class \
(http://www.scintilla.org/). \
 \
This package provides the Python bindings for QScintilla for PyQt5."
LICENSE = "GPL-3.0-only"

PV = "2.14.1"

RPM_NAME = "python313-qscintilla-qt5-2.14.1-3.7.aarch64.rpm"
RPM_HASH = "0ded8d01ee78e965fe999c9adf8acd3fe3c74083f827836997ee50da27396002191d488f9c44933bbfc9e4ba68123b2da43f468c397a5b508c9213085d14e8ce"

RPROVIDES:${PN} += "python3-qscintilla-qt5 \
python3-qscintilla-qt5-sip \
python3.13dist-qscintilla \
python313-qscintilla-qt5 \
python313-qscintilla-qt5-sip \
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
python313-PyQt5"

inherit rpm
