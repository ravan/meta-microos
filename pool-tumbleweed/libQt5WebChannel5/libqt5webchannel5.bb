SUMMARY = "Qt 5 WebChannel Addon"
DESCRIPTION = "Qt WebChannel enables peer-to-peer communication between a server \
(QML/C++ application) and a client (HTML/JavaScript or QML \
application). \
 \
The module provides a JavaScript library for seamless integration of \
C++ and QML applications with HTML/JavaScript and QML clients. The \
clients must use the JavaScript library to access the serialized \
QObjects published by the host applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde3"

RPM_NAME = "libQt5WebChannel5-5.15.19+kde3-1.2.aarch64.rpm"
RPM_HASH = "ff7346f3292bd10e88961049bffa23b43ec17f65ca71c289b9cd2b6798a59c358e13f52c5b6bab64005964d194e5643f01539b9e60f3fd36297fa9cdf74ba5ea"

RPROVIDES:${PN} += "libQt5WebChannel.so.5 \
libQt5WebChannel5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libQtQuick5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
