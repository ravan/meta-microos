SUMMARY = "Python bindings for the Qt WebEngine framework"
DESCRIPTION = "PyQt6-WebEngine is a set of Python bindings for The Qt Company's Qt WebEngine \
framework. The framework provides the ability to embed web content in \
applications and is based on the Chrome browser. The bindings sit on top of PyQt6 \
and are implemented as three separate modules corresponding to the different \
libraries that make up the framework."
LICENSE = "GPL-3.0-only"

PV = "6.11.0"

RPM_NAME = "python314-PyQt6-WebEngine-6.11.0-1.2.aarch64.rpm"
RPM_HASH = "ee98d8cf2fa8321f2f39dc1e2fe028bf3a5b6b9c1b9d485a6096cd5f462b392153e672b5325fe499fa86e0118c5116616bb7bee5dc890e3167884e1b99204240"

RPROVIDES:${PN} += "python3.14dist-pyqt6-webengine \
python314-PyQt6-WebEngine \
python314-qtwebengine-qt6 \
python3dist-pyqt6-webengine"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineQuick.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python314-PyQt6 \
python314-PyQt6-sip"

inherit rpm
