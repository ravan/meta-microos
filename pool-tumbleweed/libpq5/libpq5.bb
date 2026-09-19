SUMMARY = "Shared Libraries Required for PostgreSQL Clients"
DESCRIPTION = " \
PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, user-defined types \
and functions. \
 \
This package provides the client library that most PostgreSQL client \
program or language bindings are using."
LICENSE = "PostgreSQL"

PV = "18.6"

RPM_NAME = "libpq5-18.6-1.2.aarch64.rpm"
RPM_HASH = "637d471c3077492ead8ca21ef9651006de5e009bb692ab3f04895f5eb4ac09e5ac2ebe1c1c0069d1312e4a7d82b2f119399dec00e1ad12b39c85fa6ebc7d3f46"

RPROVIDES:${PN} += "libpq-oauth-18.so \
libpq.so.5 \
libpq5 \
postgresql-libs-/usr/lib64/libpq.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgssapi-krb5.so.2 \
libldap.so.2 \
libssl.so.3"

inherit rpm
