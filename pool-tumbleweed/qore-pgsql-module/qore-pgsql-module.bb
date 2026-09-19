SUMMARY = "PostgreSQL DBI module for Qore"
DESCRIPTION = "PostgreSQL DBI driver module for the Qore Programming Language. The PostgreSQL \
driver is character set aware, supports multithreading, transaction management, \
stored prodedure and function execution, etc."
LICENSE = "GPL-2.0-or-later | LGPL-2.0-or-later | MIT"

PV = "3.2.0"

RPM_NAME = "qore-pgsql-module-3.2.0-4.5.aarch64.rpm"
RPM_HASH = "8c13f9bd53978ed0f4d17b3567391f0fce2a5438e5fb7030aaae2ead3463eaaf2f5744ff8c067a1ed6fc7391f8363d654841464e24898d9a8e36e7356b053a8c"

RPROVIDES:${PN} += "qore-pgsql-module"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpq.so.5 \
libstdc++.so.6 \
qore-module-abi"

inherit rpm
