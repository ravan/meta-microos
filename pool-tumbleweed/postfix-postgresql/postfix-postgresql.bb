SUMMARY = "Postfix plugin to support PostgreSQL maps"
DESCRIPTION = "Postfix plugin to support PostgreSQL maps. This library will be loaded \
by starting postfix if you'll access a postmap which is stored in \
PostgreSQL."
LICENSE = "EPL-2.0 | IPL-1.0"

PV = "3.11.7"

RPM_NAME = "postfix-postgresql-3.11.7-1.1.aarch64.rpm"
RPM_HASH = "dbd54aa232f4bddddd65899a003607836868a5ee3e15202a1251d5544ad98e4bec42f7f18ba147db099fac31895c4d9fca1306908ec47bf2512e1946aa542fcd"

RPROVIDES:${PN} += "postfix-postgresql"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
postfix"

inherit rpm
