SUMMARY = "Qt 6 bluetooth library"
DESCRIPTION = "Provides access to Bluetooth hardware."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Bluetooth6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "9755ad5bb8e25fd8748f20f2aa804bc351b628940744a4c216f47b601ff796c28a640ec8ad3da165b4d17e3d126ca26d76b06146a63dd062336dc20e29513c1b"

RPROVIDES:${PN} += "libQt6Bluetooth.so.6 \
libQt6Bluetooth6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
