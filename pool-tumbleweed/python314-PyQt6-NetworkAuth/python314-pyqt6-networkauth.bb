SUMMARY = "Python bindings for the Qt Network Authorization library"
DESCRIPTION = "PyQt6-NetworkAuth is a set of Python bindings for The Qt Company's Qt Network \
Authorisation library. The bindings sit on top of PyQt6 and are implemented as \
a single module."
LICENSE = "GPL-3.0-only"

PV = "6.11.0"

RPM_NAME = "python314-PyQt6-NetworkAuth-6.11.0-1.2.aarch64.rpm"
RPM_HASH = "249e444283efac51c03f4d6cda57161786d955c2f5471f8de35ba95b40685c48a436d760895a8c4fa9cfe5cd7fe7d9ee1249c39f6e222881f7929af835936e12"

RPROVIDES:${PN} += "python3.14dist-pyqt6-networkauth \
python314-PyQt6-NetworkAuth \
python314-qtnetworkauth-qt6 \
python3dist-pyqt6-networkauth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6NetworkAuth.so.6 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python314-PyQt6 \
python314-PyQt6-sip"

inherit rpm
