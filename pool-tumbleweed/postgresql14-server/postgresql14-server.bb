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

PV = "14.24"

RPM_NAME = "postgresql14-server-14.24-2.2.aarch64.rpm"
RPM_HASH = "c4b96fa3ee2912ff7bdcb301e28254b05b68efea81fceb0aae80960b59489ed08274c12fd23b80873cad50cee0820b8fde3d8de215d850e17a4d5e4584c4e640"

RPROVIDES:${PN} += "libpqwalreceiver.so \
postgresql-server-implementation \
postgresql14-server"

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
postgresql \
postgresql-noarch \
postgresql-server-noarch \
timezone"

inherit rpm
