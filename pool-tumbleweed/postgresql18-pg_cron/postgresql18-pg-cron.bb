SUMMARY = "PostgreSQL module for simple job schedule"
DESCRIPTION = "pg_cron is a simple cron-based job scheduler for PostgreSQL (9.5 or higher) \
that runs inside the database as an extension. It uses the same syntax as \
regular cron, but it allows you to schedule PostgreSQL commands directly from \
the database."
LICENSE = "PostgreSQL"

PV = "1.6.7"

RPM_NAME = "postgresql18-pg_cron-1.6.7-1.2.aarch64.rpm"
RPM_HASH = "4fa3ed9656420b38b12669dcfea47c545bab45c609073bcdb08967332f19a3405a2ccd2c8b2161c8c0e2f6a7e85f17fa97daf340546e0c6bcc3fffce6543d2b6"

RPROVIDES:${PN} += "postgresql18-pg-cron \
postgresql18-pg-cron-llvmjit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
postgresql18-server"

inherit rpm
