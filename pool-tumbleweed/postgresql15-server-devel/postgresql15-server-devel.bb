SUMMARY = "PostgreSQL server development header files and utilities"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the header files and libraries needed to compile \
C extensions that link into the PostgreSQL server. For building client \
applications, see the postgresql15-devel package."
LICENSE = "PostgreSQL"

PV = "15.19"

RPM_NAME = "postgresql15-server-devel-15.19-2.2.aarch64.rpm"
RPM_HASH = "2babecb383e1e79354b135b784edf36a7536c4d5f0cc5bee1fff7a543971f7c0df611d9e7317880d3b87b22dbb53933d5295cec3da125cf111b546ae5e9dd7dc"

RPROVIDES:${PN} += "postgresql-server-devel \
postgresql-server-devel-exclusive \
postgresql-server-devel-implementation \
postgresql15-server-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
libselinux-devel \
libxslt-devel \
openssl-devel \
pam-devel \
pkgconfig-krb5 \
postgresql-server-devel-noarch \
postgresql15-devel \
postgresql15-server \
readline-devel \
zlib-devel"

inherit rpm
