SUMMARY = "Python bindings for the Qt Network Authorization library"
DESCRIPTION = "PyQt6-NetworkAuth is a set of Python bindings for The Qt Company's Qt Network \
Authorisation library. The bindings sit on top of PyQt6 and are implemented as \
a single module."
LICENSE = "GPL-3.0-only"

PV = "6.11.0"

RPM_NAME = "python313-PyQt6-NetworkAuth-6.11.0-1.2.aarch64.rpm"
RPM_HASH = "cf58d372b52163a849762373bc569aa5dc3051103f69fac975ae50574ed2c7fd57bb65edb8ecc87c0a55b9f87d8d6c79ff8578689640fa311963a56689cd0818"

RPROVIDES:${PN} += "python3-PyQt6-NetworkAuth \
python3-qtnetworkauth-qt6 \
python3.13dist-pyqt6-networkauth \
python313-PyQt6-NetworkAuth \
python313-qtnetworkauth-qt6 \
python3dist-pyqt6-networkauth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6NetworkAuth.so.6 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python313-PyQt6 \
python313-PyQt6-sip"

inherit rpm
