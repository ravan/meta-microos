SUMMARY = "Python bindings for the Qt5 WebEngine framework"
DESCRIPTION = "PyQtWebEngine is a set of Python bindings for the Qt5 WebEngine \
framework. The framework provides the ability to embed web \
content in applications."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python313-qtwebengine-qt5-5.15.6-6.7.aarch64.rpm"
RPM_HASH = "1ca9f8dc71398b8063e68000a09197593d9460cc732c84556be116d66d6da98c40e955f4c2335c5a1899e00d95a627a3ea008c175e4fdee8ba101ef94b2e36af"

RPROVIDES:${PN} += "python3-PyQtWebEngine \
python3-qtwebengine-qt5 \
python3.13dist-pyqtwebengine \
python313-PyQtWebEngine \
python313-qtwebengine-qt5 \
python3dist-pyqtwebengine"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5WebEngine.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python313-qt5 \
python313-qt5-sip"

inherit rpm
