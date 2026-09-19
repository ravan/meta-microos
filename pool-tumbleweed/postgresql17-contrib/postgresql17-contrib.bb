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

PV = "17.11"

RPM_NAME = "postgresql17-contrib-17.11-2.2.aarch64.rpm"
RPM_HASH = "71b0685365993726238de9ad21efb1594e173da7de614621ebf0dd80d7d275fcba338d3ae19916bcd6187d5e8cd9eac7bd980624b1e7266fdca6efc0c85807b4"

RPROVIDES:${PN} += "postgresql-contrib-implementation \
postgresql17-contrib"

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
postgresql17 \
postgresql17-server"

inherit rpm
