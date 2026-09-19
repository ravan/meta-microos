SUMMARY = "Python bindings for the Qt Network Authorization library"
DESCRIPTION = "PyQtNetworkAuth is a set of Python bindings for The Qt Company’s Qt Network \
Authorization library. The bindings sit on top of PyQt5 and are implemented \
as a single module."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python313-qtnetworkauth-qt5-5.15.5-3.7.aarch64.rpm"
RPM_HASH = "644c038d5fc3daf3a40757a7d8d0c0c8fb7aa56d374a8cd2247cff4887d4d77e245d567ede54d533767110d000f834c6a1015db388bf2ba47d760ba6fd3697db"

RPROVIDES:${PN} += "python3-PyQtNetworkAuth \
python3-qtnetworkauth-qt5 \
python3.13dist-pyqtnetworkauth \
python313-PyQtNetworkAuth \
python313-qtnetworkauth-qt5 \
python3dist-pyqtnetworkauth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5NetworkAuth.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python313-qt5 \
python313-qt5-sip"

inherit rpm
