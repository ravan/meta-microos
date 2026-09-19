SUMMARY = "Database connectivity and creation framework - SQLite3 driver"
DESCRIPTION = "This package contains the SQLite3 driver for the Database connectivity and creation framework"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "kdb-sqlite3-driver-3.2.0-10.7.aarch64.rpm"
RPM_HASH = "acc7d72e54d4dd74423d912c6fdda6277c96ebb66a0b0a0f6dc3e5b8432109de121b0b983e24f1bd35cbb9d7f4428160555e7ef6f59fdba3c63daf1638c0c471"

RPROVIDES:${PN} += "calligra-kexi-sqlite3-driver \
kdb-sqlite3-driver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKDb3.so.4 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libicui18n.so.78 \
libicuuc.so.78 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
