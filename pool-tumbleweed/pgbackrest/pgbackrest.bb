SUMMARY = "Reliable PostgreSQL Backup & Restore"
DESCRIPTION = "pgBackRest aims to be a simple, reliable backup and restore system for \
PostgreSQL that can seamlessly scale up to the largest databases and \
workloads. \
 \
The following features are available: \
- Parallel backup & restore \
- Local or remote operation \
- Full, incremental, differential backups \
- Backup rotation & archive expiration \
- Backup integrity \
- Page checksums \
- Backup resume \
- Streaming compression & checksums \
- Delta restore \
- Parallel, asynchronous WAL push & get \
- Tablespace & link support \
- Amazon S3 support \
- Encryption \
- Compatibility with PostgreSQL >= 8.3"
LICENSE = "MIT"

PV = "2.59.1"

RPM_NAME = "pgbackrest-2.59.1-1.1.aarch64.rpm"
RPM_HASH = "e3db9ba43fbcc134940f86f5dad6daa0a3b73edd5969b8a35cd403ef20d80f109a8bc977f5d620bc53f76fcd542adad79abc03894d5c06d191bbb7c319a998bc"

RPROVIDES:${PN} += "config-pgbackrest \
pgbackrest"

RDEPENDS:${PN} += "/usr/bin/sh \
group-postgres \
ld-linux-aarch64.so.1 \
libbacktrace.so.0 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblz4.so.1 \
libpq.so.5 \
libssh2.so.1 \
libssl.so.3 \
libsystemd.so.0 \
libxml2.so.16 \
libz.so.1 \
libzstd.so.1 \
postgresql-server \
user-postgres"

inherit rpm
