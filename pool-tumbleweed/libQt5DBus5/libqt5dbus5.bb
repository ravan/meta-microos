SUMMARY = "Qt5 D-Bus library"
DESCRIPTION = "The Qt D-Bus module is a library that can be used to perform \
inter-process communication using the D-Bus protocol."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5DBus5-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "0c4440af6ab77eb5a29431a95157fc48c0da9a94201a38eab4ae9c206b252a5ebe397931d741a851971eb8531948ab7a0789fa4077bad11ac9ace32bdcb76a1d"

RPROVIDES:${PN} += "libQt5DBus.so.5 \
libQt5DBus5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libdbus-1.so.3 \
libstdc++.so.6"

inherit rpm
