SUMMARY = "PostgreSQL client development header files and libraries"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the header files and libraries needed to compile \
C applications which will directly interact with a PostgreSQL database \
management server and the ECPG Embedded C Postgres preprocessor. You \
need to install this package if you want to develop applications in C \
which will interact with a PostgreSQL server. \
 \
For building PostgreSQL server extensions, see the \
postgresql14-server-devel package."
LICENSE = "PostgreSQL"

PV = "14.24"

RPM_NAME = "postgresql14-devel-14.24-2.2.aarch64.rpm"
RPM_HASH = "7bba8bd51273f42103522a0d891cc6cd0b2b61aa72142cf662d5d7be59bf1ca6d1da11aed71d96196b0a4d8de638b02c6079b64edde10f5fd2ebd72992bbc43e"

RPROVIDES:${PN} += "pkgconfig-libecpg \
pkgconfig-libecpg-compat \
pkgconfig-libpgtypes \
pkgconfig-libpq \
postgresql-devel \
postgresql-devel-exclusive \
postgresql-devel-implementation \
postgresql14-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libecpg6 \
libpq5 \
pkgconfig-libcrypto \
pkgconfig-libecpg \
pkgconfig-libpgtypes \
pkgconfig-libpq \
pkgconfig-libssl \
postgresql-devel-noarch"

inherit rpm
