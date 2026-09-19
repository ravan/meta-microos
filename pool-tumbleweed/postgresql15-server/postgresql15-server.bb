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

PV = "15.19"

RPM_NAME = "postgresql15-server-15.19-2.2.aarch64.rpm"
RPM_HASH = "488ccb70eca33aed3dd206dc0649f7bba7e37cca42eb29395a1b1f677992d1273bc8ae935f792e7162b51ed1a97c2215e51f9060186c018bab95af7c6764bd09"

RPROVIDES:${PN} += "libpqwalreceiver.so \
postgresql-server-implementation \
postgresql15-server"

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
