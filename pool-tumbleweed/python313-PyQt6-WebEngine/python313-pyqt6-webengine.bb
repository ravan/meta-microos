SUMMARY = "Python bindings for the Qt WebEngine framework"
DESCRIPTION = "PyQt6-WebEngine is a set of Python bindings for The Qt Company's Qt WebEngine \
framework. The framework provides the ability to embed web content in \
applications and is based on the Chrome browser. The bindings sit on top of PyQt6 \
and are implemented as three separate modules corresponding to the different \
libraries that make up the framework."
LICENSE = "GPL-3.0-only"

PV = "6.11.0"

RPM_NAME = "python313-PyQt6-WebEngine-6.11.0-1.2.aarch64.rpm"
RPM_HASH = "b8dd5ef95abbceb38e48bf50424adb40b7c2f3b44ad381b5ceda9328b6c3131219b5eb182688504da596c1b52ea11409de8187849e9c09f1f7e0e63691d95642"

RPROVIDES:${PN} += "python3-PyQt6-WebEngine \
python3-qtwebengine-qt6 \
python3.13dist-pyqt6-webengine \
python313-PyQt6-WebEngine \
python313-qtwebengine-qt6 \
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
python313-PyQt6 \
python313-PyQt6-sip"

inherit rpm
