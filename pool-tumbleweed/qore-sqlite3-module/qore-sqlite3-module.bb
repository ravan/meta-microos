SUMMARY = "Sqlite3 DBI module for Qore"
DESCRIPTION = "Sqlite3 DBI driver module for the Qore Programming Language."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.2"

RPM_NAME = "qore-sqlite3-module-1.0.2-3.5.aarch64.rpm"
RPM_HASH = "9758abe1d61f42a2c9b9544d51fc88e9bec47866634035ba6c58d2829b172f3954d6dea0648eaa661a1f3545f2abf1dc7a6f50ce04c9cba71332c63361dd3a66"

RPROVIDES:${PN} += "qore-sqlite3-module"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
qore-module-abi"

inherit rpm
