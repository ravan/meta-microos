SUMMARY = "PostgreSQL server development header files and utilities"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the header files and libraries needed to compile \
C extensions that link into the PostgreSQL server. For building client \
applications, see the postgresql18-devel package."
LICENSE = "PostgreSQL"

PV = "18.6"

RPM_NAME = "postgresql18-server-devel-18.6-1.2.aarch64.rpm"
RPM_HASH = "05fbe5ee2dc518d9726197b6b8b27ea36d6661077bd5f7bc232e32fd3510610bc599936a5f75b9a8123f473a0eb51508da3fa6cfef084431efae20f947131958"

RPROVIDES:${PN} += "postgresql-server-devel \
postgresql-server-devel-exclusive \
postgresql-server-devel-implementation \
postgresql18-server-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
libselinux-devel \
libxslt-devel \
openssl-devel \
pam-devel \
pkgconfig-krb5 \
pkgconfig-numa \
postgresql-server-devel-noarch \
postgresql18-devel \
postgresql18-server \
readline-devel \
zlib-devel"

inherit rpm
