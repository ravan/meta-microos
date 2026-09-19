SUMMARY = "SQL auxprop plugin for cyrus-sasl"
DESCRIPTION = "The SQL auxprop plugin supports PostgreSQL and MySQL"
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-sqlauxprop-2.1.28-12.4.aarch64.rpm"
RPM_HASH = "2a30de959bd7271ee021a9573ffb726f0cbbdd273d614ac59ddb8c84af7c29613a1b86200e071605f339929ba56b770f6de010f631e8c1b286e051c0afca5e98"

RPROVIDES:${PN} += "cyrus-sasl-sqlauxprop \
libsql.so.3"

RDEPENDS:${PN} += "cyrus-sasl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
libpq.so.5"

inherit rpm
