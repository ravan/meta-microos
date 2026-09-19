SUMMARY = "MySQL DBI module for Qore"
DESCRIPTION = "MySQL DBI driver module for the Qore Programming Language. The MySQL driver is \
character set aware and supports multithreading, transaction management, and \
stored procedure execution."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "2.1"

RPM_NAME = "qore-mysql-module-2.1-2.5.aarch64.rpm"
RPM_HASH = "6b25b2bb80b9b5b01ae9c9bde0b9d50976456757f372e23476ae4ac973689aaa98b3f9a50a2f01fbae7b7aad55eee862cb83ca890cead3c308108178b71a4f42"

RPROVIDES:${PN} += "qore-mysql-module"

RDEPENDS:${PN} += "/usr/bin/env \
libc.so.6 \
libgcc-s.so.1 \
libmariadb.so.3 \
libstdc++.so.6 \
qore-module-abi"

inherit rpm
