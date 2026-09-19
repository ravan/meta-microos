SUMMARY = "Qt 6 WebChannel library"
DESCRIPTION = "The Qt 6 WebChannel library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6WebChannel6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "8d7ad3f115e46c4f5d63b101ce3ce16e658fcbc010d6163c55fa06dda2156ca0f337f48f7d6fe91300ede85b54c01df06bd8b941a1b5affcb7696e8882cc4f39"

RPROVIDES:${PN} += "libQt6WebChannel.so.6 \
libQt6WebChannel6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
