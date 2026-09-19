SUMMARY = "PostgreSQL module for simple job schedule"
DESCRIPTION = "pg_cron is a simple cron-based job scheduler for PostgreSQL (9.5 or higher) \
that runs inside the database as an extension. It uses the same syntax as \
regular cron, but it allows you to schedule PostgreSQL commands directly from \
the database."
LICENSE = "PostgreSQL"

PV = "1.6.7"

RPM_NAME = "postgresql16-pg_cron-1.6.7-1.2.aarch64.rpm"
RPM_HASH = "e98e03f284b52d4c8f3ba3ad3b031133d0a78154a27ccf16425db27357c1b5f01544a4c136314cc112d7b803f2798df9c0f65907f914b8d69117d1c3bd6841e0"

RPROVIDES:${PN} += "postgresql16-pg-cron \
postgresql16-pg-cron-llvmjit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
postgresql16-server"

inherit rpm
