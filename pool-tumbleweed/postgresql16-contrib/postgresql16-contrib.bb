SUMMARY = "Contributed Extensions and Additions to PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
The postgresql-contrib package includes extensions and additions that \
are distributed along with the PostgreSQL sources, but are not (yet) \
officially part of the PostgreSQL core. \
 \
Documentation for the modules contained in this package can be found in \
/usr/share/doc/packages/postgresql/contrib."
LICENSE = "PostgreSQL"

PV = "16.15"

RPM_NAME = "postgresql16-contrib-16.15-2.2.aarch64.rpm"
RPM_HASH = "d7ff0a5bff867e8890fe62d329f7e78194df6a61720a5560a659e1c8c7c1ec0a46340650ab401b9a3e64b4d66296fa612028573444eed818d8289cddd3817f61"

RPROVIDES:${PN} += "postgresql-contrib-implementation \
postgresql16-contrib"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libperl.so \
libpq.so.5 \
libpython3.13.so.1.0 \
libselinux.so.1 \
libuuid.so.1 \
libxml2.so.16 \
libxslt.so.1 \
libz.so.1 \
postgresql-contrib-noarch \
postgresql16 \
postgresql16-server"

inherit rpm
