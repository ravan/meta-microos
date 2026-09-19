SUMMARY = "Qt 6 QmlCore library"
DESCRIPTION = "The Qt 6 QmlCore library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6QmlCore6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "a26d163b117fb26efc5e7ab48320a478ddadf41d2488d9601bc3ed4f6c94786c404ad34b6a563da6a8954bd821cd082db312136c996465495707a631f5567a30"

RPROVIDES:${PN} += "libQt6QmlCore.so.6 \
libQt6QmlCore6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-declarative-imports"

inherit rpm
