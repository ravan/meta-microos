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

PV = "18.6"

RPM_NAME = "postgresql18-server-18.6-1.2.aarch64.rpm"
RPM_HASH = "9fba33378637b1b2bae6842520b229564973518a4895ed7a727b7583ee3468539cf31628330847d63a4f2c9d48d0d12f09bbf91e74f9bf6ab678655386e9fb30"

RPROVIDES:${PN} += "libpqwalreceiver.so \
postgresql-server-implementation \
postgresql18-server"

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
libnuma.so.1 \
libpam.so.0 \
libpq.so.5 \
libpq5 \
libssl.so.3 \
libsystemd.so.0 \
liburing.so.2 \
libxml2.so.16 \
libz.so.1 \
libzstd.so.1 \
postgresql \
postgresql-noarch \
postgresql-server-noarch \
timezone"

inherit rpm
