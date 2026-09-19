SUMMARY = "Qt 6 RemoteObjectsQml library"
DESCRIPTION = "The Qt 6 RemoteObjectsQml library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6RemoteObjectsQml6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "848809ccc274f8882100c8ded4cafe68bffc2b081931f34ea65f4b51daf1ff061b2debf12e744e1f892426ae8c127385d66af66e4b69c655c07b6a63fdbc8988"

RPROVIDES:${PN} += "libQt6RemoteObjectsQml.so.6 \
libQt6RemoteObjectsQml6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6RemoteObjects.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
