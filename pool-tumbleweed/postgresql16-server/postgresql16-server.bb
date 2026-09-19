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

PV = "16.15"

RPM_NAME = "postgresql16-server-16.15-2.2.aarch64.rpm"
RPM_HASH = "5b1a504961cb70fe9cd031e095c031a6135ec4fa9851208030650fc47781b3c3c3734f96b27456df769d8723ce51d27efb133acf377b4de655fdc916d1663143"

RPROVIDES:${PN} += "libpqwalreceiver.so \
postgresql-server-implementation \
postgresql16-server"

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
