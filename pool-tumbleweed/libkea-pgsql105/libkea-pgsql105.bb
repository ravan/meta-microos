SUMMARY = "Kea PostgreSQL database library"
DESCRIPTION = "Kea's database library for PostgreSQL."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "libkea-pgsql105-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "c33fb64783f0b223ade564cc9f71cb3c61a7ab1bfd6fa901b37f7b41cecc9c154bad7b1ea586444246c1a1301aff0342cdfce0c16b26a3aa78a2bf4e440c757a"

RPROVIDES:${PN} += "libkea-pgsql.so.105 \
libkea-pgsql105"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiolink.so.105 \
libkea-cc.so.98 \
libkea-database.so.88 \
libkea-exceptions.so.55 \
libkea-log.so.86 \
libkea-util.so.118 \
libpq.so.5 \
libstdc++.so.6"

inherit rpm
