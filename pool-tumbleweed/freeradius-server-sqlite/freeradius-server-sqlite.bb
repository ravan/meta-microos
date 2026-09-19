SUMMARY = "SQLite support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing SQLite support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.8"

RPM_NAME = "freeradius-server-sqlite-3.2.8-1.8.aarch64.rpm"
RPM_HASH = "c74f9637c6c9bf9f1dd8f7b33950916eeea50caa7984b047e93743aa9688dbb6f3e8c96e8686d19db0c613645c955fabdf571fe5ae97f894a8f293670875530b"

RPROVIDES:${PN} += "config-freeradius-server-sqlite \
freeradius-server-sqlite"

RDEPENDS:${PN} += "freeradius-server \
group-radiusd \
libc.so.6 \
libsqlite3.so.0"

inherit rpm
