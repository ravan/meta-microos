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

PV = "14.24"

RPM_NAME = "postgresql14-contrib-14.24-2.2.aarch64.rpm"
RPM_HASH = "5c6b47faee9721bda0761b604735e485568356b3c753d3c72812b76b12bdcadcb1ce92ba6a7f66ffa0fe276ce958708df8a61ade29fee3917b2ce599cd96efac"

RPROVIDES:${PN} += "postgresql-contrib-implementation \
postgresql14-contrib"

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
postgresql14 \
postgresql14-server"

inherit rpm
