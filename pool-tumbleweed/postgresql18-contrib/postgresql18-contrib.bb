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

PV = "18.6"

RPM_NAME = "postgresql18-contrib-18.6-1.2.aarch64.rpm"
RPM_HASH = "6501147f9c067a5661581dec5c6bedbe99e3e728ecc694ac7043541da81d481ec3be21cdc477d19f155eb36282b23140ce9633da7c1de4ab48f1c31bb406753e"

RPROVIDES:${PN} += "postgresql-contrib-implementation \
postgresql18-contrib"

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
postgresql18 \
postgresql18-server"

inherit rpm
