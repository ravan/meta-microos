SUMMARY = "QML imports for the Qt5 WebSockets library"
DESCRIPTION = "The module provides a JavaScript library for seamless integration of \
C++ and QML applications with HTML/JavaScript and QML clients."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde3"

RPM_NAME = "libQt5WebChannel5-imports-5.15.19+kde3-1.2.aarch64.rpm"
RPM_HASH = "d4d25796304e502754828bcc277fbe12c5148d571280bb62caf6622edcb3a710d3bb78d9e1bb07cff46b2763652aa77e263f175dcead94d4fdb5a88ba2c87ca3"

RPROVIDES:${PN} += "libQt5WebChannel5-imports \
libdeclarative-webchannel.so \
qt5qmlimport-QtWebChannel.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libQt5WebChannel.so.5 \
libQtQuick5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
