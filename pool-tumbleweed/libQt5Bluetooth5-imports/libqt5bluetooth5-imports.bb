SUMMARY = "Qt 5 Bluez Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt5Bluetooth5-imports-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "9a6295fed1f98343e19a698a69bcc5f77da784adf8c3073be4667db3055a0097e511627d01349631a9c978d0f2a9be90c4ab12ed9dc98498b2d45cefaa10c468"

RPROVIDES:${PN} += "libQt5Bluetooth5-imports \
libdeclarative-bluetooth.so \
qt5qmlimport-QtBluetooth.5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Bluetooth.so.5 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libQtQuick5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
