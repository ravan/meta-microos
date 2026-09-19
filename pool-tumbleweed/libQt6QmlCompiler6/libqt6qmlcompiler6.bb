SUMMARY = "Qt6 QmlCompiler library"
DESCRIPTION = "The Qt 6 QmlCompiler library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6QmlCompiler6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "6e7744cdbc247da2fbd3c20558998fc7706caba2eaeddcf6bd26da4f80242a55bc3844575819a96c5d366ecefe95b5ef681db82e1377de4d7ca7eba10c1bfed5"

RPROVIDES:${PN} += "libQt6QmlCompiler.so.6 \
libQt6QmlCompiler6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
