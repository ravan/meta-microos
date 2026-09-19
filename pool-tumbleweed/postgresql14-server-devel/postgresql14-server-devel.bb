SUMMARY = "PostgreSQL server development header files and utilities"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the header files and libraries needed to compile \
C extensions that link into the PostgreSQL server. For building client \
applications, see the postgresql14-devel package."
LICENSE = "PostgreSQL"

PV = "14.24"

RPM_NAME = "postgresql14-server-devel-14.24-2.2.aarch64.rpm"
RPM_HASH = "6a07dd446fd3c72c0364103b8fee0a12a656f1d4835c0cb3c435eb14ce7caf466714862f2a85ccd5f77f51faab83242650445adc7c08fdae8bd2318fdeba7564"

RPROVIDES:${PN} += "postgresql-server-devel \
postgresql-server-devel-exclusive \
postgresql-server-devel-implementation \
postgresql14-server-devel"

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
postgresql14-devel \
postgresql14-server \
readline-devel \
zlib-devel"

inherit rpm
