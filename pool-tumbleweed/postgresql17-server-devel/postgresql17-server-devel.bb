SUMMARY = "PostgreSQL server development header files and utilities"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the header files and libraries needed to compile \
C extensions that link into the PostgreSQL server. For building client \
applications, see the postgresql17-devel package."
LICENSE = "PostgreSQL"

PV = "17.11"

RPM_NAME = "postgresql17-server-devel-17.11-2.2.aarch64.rpm"
RPM_HASH = "50dbad8cb618a5f1ec0f019b575a4931898bfbcdb87e90032638ae4054ca8c5556f00d5cd9bd0024badf58635766a3a2a8d6d9086c28a99680e76bb85cbd1ac9"

RPROVIDES:${PN} += "postgresql-server-devel \
postgresql-server-devel-exclusive \
postgresql-server-devel-implementation \
postgresql17-server-devel"

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
postgresql17-devel \
postgresql17-server \
readline-devel \
zlib-devel"

inherit rpm
