SUMMARY = "PostgreSQL server development header files and utilities"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the header files and libraries needed to compile \
C extensions that link into the PostgreSQL server. For building client \
applications, see the postgresql16-devel package."
LICENSE = "PostgreSQL"

PV = "16.15"

RPM_NAME = "postgresql16-server-devel-16.15-2.2.aarch64.rpm"
RPM_HASH = "4f01d494719d5e874f114f084f57d63d8ac14c9e05b0a42d495334c3e0825ded4f5e2f211219cb75a169f8bd023f1761c75026c6374dd813f479c198c2097b01"

RPROVIDES:${PN} += "postgresql-server-devel \
postgresql-server-devel-exclusive \
postgresql-server-devel-implementation \
postgresql16-server-devel"

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
postgresql16-devel \
postgresql16-server \
readline-devel \
zlib-devel"

inherit rpm
