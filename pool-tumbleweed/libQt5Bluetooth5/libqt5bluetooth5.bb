SUMMARY = "Qt 5 Bluez Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt5Bluetooth5-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "2927b368a56852b35ccea9b7ebfa4549e7ed6a385bf16f7e7bf962b6184c58c63d204829666213d523c01963ee30f0d67de72e42855317de4dfd770395763699"

RPROVIDES:${PN} += "libQt5Bluetooth.so.5 \
libQt5Bluetooth5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5DBus5 \
libQt5Network.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
