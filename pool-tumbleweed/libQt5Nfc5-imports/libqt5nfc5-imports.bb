SUMMARY = "Qt 5 Nfc Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt5Nfc5-imports-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "b0351c74f720e66808cbb0b352b3d1711dfeb57addf9e03dddb3ff7f6cb900b3fdef015444ad68c637cfb3e80ed222e0e7c1e3bc64a458cca2a4716c8d0767cd"

RPROVIDES:${PN} += "libQt5Nfc5-imports \
libdeclarative-nfc.so \
qt5qmlimport-QtNfc.5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Nfc.so.5 \
libQt5Qml.so.5 \
libQtQuick5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
