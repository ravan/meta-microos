SUMMARY = "Library for accessing SQLite"
DESCRIPTION = "A library for accessing SQLite (and other databases) in Qt projects without \
blocking. \
 \
It also features a migration system and automatic result deserialization."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.1"

RPM_NAME = "libfuturesql5-0-0.1.1-1.10.aarch64.rpm"
RPM_HASH = "6cd494195b4b53628ba232b3e08cd64220902b4fcdca47a2a0279db3896461c6b2bb5c6e01014649ff3abb9f9bd277cce6d0791cd5b3d4999b169946c1a7e7e0"

RPROVIDES:${PN} += "libfuturesql5-0 \
libfuturesql5.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Sql.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
