SUMMARY = "SQL auxprop plugin for cyrus-sasl"
DESCRIPTION = "The SQL auxprop plugin supports PostgreSQL and MySQL"
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-sqlauxprop-bdb-2.1.28-12.4.aarch64.rpm"
RPM_HASH = "dd8e83d95e89ba0b9836d77d055dca1cd1e73dc633d0e46b2f9c75183869755532fe28dcec162565ffb4652e0c9a2cbb0122c167a6c2ed794556373e3a2b6084"

RPROVIDES:${PN} += "cyrus-sasl-sqlauxprop-bdb \
libsql.so.3"

RDEPENDS:${PN} += "cyrus-sasl-bdb \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
libpq.so.5"

inherit rpm
