SUMMARY = "Python bindings for the Qt5 WebEngine framework"
DESCRIPTION = "PyQtWebEngine is a set of Python bindings for the Qt5 WebEngine \
framework. The framework provides the ability to embed web \
content in applications."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python314-qtwebengine-qt5-5.15.6-6.7.aarch64.rpm"
RPM_HASH = "b991ff0788f361c4d947cc5b0a2bb4fdcab993258c8e735f21350ddf2b28017b4a047d0ef30145446bc5e6913e62a066ca2e1ec135ec2fbca3052fe2abf8719a"

RPROVIDES:${PN} += "python3.14dist-pyqtwebengine \
python314-PyQtWebEngine \
python314-qtwebengine-qt5 \
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
python314-qt5 \
python314-qt5-sip"

inherit rpm
