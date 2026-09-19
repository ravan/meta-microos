SUMMARY = "The Programs Needed to Create and Run a PostgreSQL Server"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package includes the programs needed to create and run a \
PostgreSQL server, which will in turn allow you to create and maintain \
PostgreSQL databases."
LICENSE = "PostgreSQL"

PV = "17.11"

RPM_NAME = "postgresql17-server-17.11-2.2.aarch64.rpm"
RPM_HASH = "7d918b2524f03899d34a9643e0db30c60b743026981a5e8d1ca4ec4f06b08841ec67e496b24bbfc000b0eef1fe65201e5870599925d19ac6c567d5d7d6f84314"

RPROVIDES:${PN} += "libpqwalreceiver.so \
postgresql-server-implementation \
postgresql17-server"

RDEPENDS:${PN} += "/usr/bin/sh \
glibc-locale \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgssapi-krb5.so.2 \
libicui18n.so.78 \
libicuuc.so.78 \
libldap.so.2 \
liblz4.so.1 \
libm.so.6 \
libpam.so.0 \
libpq.so.5 \
libpq5 \
libssl.so.3 \
libsystemd.so.0 \
libxml2.so.16 \
libz.so.1 \
libzstd.so.1 \
postgresql \
postgresql-noarch \
postgresql-server-noarch \
timezone"

inherit rpm
