SUMMARY = "Qt 5 Nfc Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtconnectivity-tools-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "e656f1c28d83985e3c61baafa0d53870bfde33993670749b70ee042e6cae1ada6aeba47bdf0d1a456f0e61c9cbe5f308fe0889aa08a58f1ac2b5082b1f627bfb"

RPROVIDES:${PN} += "libqt5-qtconnectivity-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libbluetooth.so.3 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
