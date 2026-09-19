SUMMARY = "top for postgresql"
DESCRIPTION = "pg_top is 'top' for PostgreSQL. It is derived from Unix Top. Similar to top, pg_top allows you to monitor PostgreSQL processes."
LICENSE = "BSD-3-Clause"

PV = "4.1.3"

RPM_NAME = "pg_top-4.1.3-1.3.aarch64.rpm"
RPM_HASH = "a31a4068f19c97703f06b884ea932cadd5394bd765951a9750408a3ecdf60078c26e9e56a79f44003bfe2fb9d4587993e08d13f4f1db0e7315f0d990a18b5a30"

RPROVIDES:${PN} += "pg-top"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
libtinfo.so.6"

inherit rpm
