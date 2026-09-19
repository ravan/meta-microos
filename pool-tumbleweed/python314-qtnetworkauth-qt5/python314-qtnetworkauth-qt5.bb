SUMMARY = "Python bindings for the Qt Network Authorization library"
DESCRIPTION = "PyQtNetworkAuth is a set of Python bindings for The Qt Company’s Qt Network \
Authorization library. The bindings sit on top of PyQt5 and are implemented \
as a single module."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python314-qtnetworkauth-qt5-5.15.5-3.7.aarch64.rpm"
RPM_HASH = "4967c163b77bf784145648954f1f7794bb41692c4950c1aabea942fff611c0eab226d1b6703a6addc81db17d0900b13a09a3001f392b948d0be7837959942603"

RPROVIDES:${PN} += "python3.14dist-pyqtnetworkauth \
python314-PyQtNetworkAuth \
python314-qtnetworkauth-qt5 \
python3dist-pyqtnetworkauth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5NetworkAuth.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python314-qt5 \
python314-qt5-sip"

inherit rpm
