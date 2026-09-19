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

PV = "15.19"

RPM_NAME = "postgresql15-contrib-15.19-2.2.aarch64.rpm"
RPM_HASH = "cbc61096a3ac2565e3538a871bd44d68c6eedf9d1c16e35c8ad5cb4392e27dcb1c39161f99cde648971b8c55f30687f2a4194e6a369a4516dde5c91a7e4c7d24"

RPROVIDES:${PN} += "postgresql-contrib-implementation \
postgresql15-contrib"

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
postgresql15 \
postgresql15-server"

inherit rpm
