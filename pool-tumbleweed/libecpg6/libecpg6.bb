SUMMARY = "Shared Libraries Required for PostgreSQL Clients"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, user-defined types \
and functions. \
 \
This package provides the runtime library of the embedded SQL C \
preprocessor for PostgreSQL."
LICENSE = "PostgreSQL"

PV = "18.6"

RPM_NAME = "libecpg6-18.6-1.2.aarch64.rpm"
RPM_HASH = "5d8d829fafd952d545ace3e9667c8ec88886d443d594f47e47d9eb8a49617e30616ddab7d5491c8ebe6f4625482988b437817f48344bef2aecfee54a9c632cdf"

RPROVIDES:${PN} += "libecpg-compat.so.3 \
libecpg.so.6 \
libecpg6 \
libpgtypes.so.3 \
postgresql-libs-/usr/lib64/libecpg.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5"

inherit rpm
