SUMMARY = "PostgreSQL Module for ProFTPD"
DESCRIPTION = "This is the PostgreSQL Module for ProFTPD"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.9c"

RPM_NAME = "proftpd-pgsql-1.3.9c-2.1.aarch64.rpm"
RPM_HASH = "fbd5aea3a36d6b6cc1381ba59154d301375c97be3fc925f53b41e9768dda38e885141ea2b4e419d02708a78a67600842d919d6cb65abaf337f115a24ae615d41"

RPROVIDES:${PN} += "proftpd-pgsql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
proftpd"

inherit rpm
