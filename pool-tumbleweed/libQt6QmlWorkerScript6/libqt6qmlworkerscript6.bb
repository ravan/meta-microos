SUMMARY = "Qt 6 QmlWorkScript library"
DESCRIPTION = "The Qt 6 QmlModels library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6QmlWorkerScript6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "f43c95bea4f62cc64480202b5a65d8eab2eeb9f0ab14002ec97a6581ca8007f69947d29a043dbddf1edd14c115274e7a685a76f7d9363a892bb9ed34168436aa"

RPROVIDES:${PN} += "libQt6QmlWorkerScript.so.6 \
libQt6QmlWorkerScript6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
