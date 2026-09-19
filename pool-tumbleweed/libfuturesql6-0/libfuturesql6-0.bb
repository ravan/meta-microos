SUMMARY = "Library for accessing SQLite"
DESCRIPTION = "A library for accessing SQLite (and other databases) in Qt projects without \
blocking. \
 \
It also features a migration system and automatic result deserialization."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.1"

RPM_NAME = "libfuturesql6-0-0.1.1-1.11.aarch64.rpm"
RPM_HASH = "2bf8b708af22e489c31f00a3a7f54a3327b3229dc984e5e931e347c565ec28640c7bf9022fdc7ef354851c3fc157bf928cd646c57c1ec7e84fe8800f2ceb1f10"

RPROVIDES:${PN} += "libfuturesql6-0 \
libfuturesql6.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Sql.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
