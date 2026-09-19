SUMMARY = "PostgreSQL output target for ulogd"
DESCRIPTION = "PostgreSQL output target for ulogd."
LICENSE = "GPL-2.0-only"

PV = "2.0.9"

RPM_NAME = "ulogd-pgsql-2.0.9-1.6.aarch64.rpm"
RPM_HASH = "201da7b6ce62d438d7e0d0d30f2d07ea48194dd8cf67ae7041dd70bc38dfbe70ccd020e8bdda521f2f50e7386bd093a19ea8b6c400ef8a7db7f661173506f2d1"

RPROVIDES:${PN} += "ulogd-pgsql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
ulogd"

inherit rpm
