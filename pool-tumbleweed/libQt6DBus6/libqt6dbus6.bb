SUMMARY = "Qt6 D-Bus library"
DESCRIPTION = "The Qt D-Bus module is a library that can be used to perform \
inter-process communication using the D-Bus protocol."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6DBus6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "aa694dc263ed04e3892b6fdeb6b87e59f8c8db4566cc0f5e8ca0fb8c230ab25f94c72a70f7a5108e1286419f892490c1786cb7619cc534bcee2e998c926d097a"

RPROVIDES:${PN} += "libQt6DBus.so.6 \
libQt6DBus6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core6 \
libc.so.6 \
libdbus-1.so.3 \
libstdc++.so.6"

inherit rpm
