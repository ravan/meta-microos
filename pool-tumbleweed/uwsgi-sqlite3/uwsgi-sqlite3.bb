SUMMARY = "SQLite3 Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for storing application configuration in SQLite3 \
databases."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.31"

RPM_NAME = "uwsgi-sqlite3-2.0.31-4.4.aarch64.rpm"
RPM_HASH = "b86d3eb4682d5076bee01f4d99b0fc850828deb090b287dc31a1bc237155ea56723027caba6e11fbb8a0214cd01be291b0dd353f5373b80761e5f91e6b21bfd4"

RPROVIDES:${PN} += "uwsgi-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
uwsgi"

inherit rpm
