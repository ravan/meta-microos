SUMMARY = "PostgreSQL module for simple job schedule"
DESCRIPTION = "pg_cron is a simple cron-based job scheduler for PostgreSQL (9.5 or higher) \
that runs inside the database as an extension. It uses the same syntax as \
regular cron, but it allows you to schedule PostgreSQL commands directly from \
the database."
LICENSE = "PostgreSQL"

PV = "1.6.7"

RPM_NAME = "postgresql17-pg_cron-1.6.7-1.2.aarch64.rpm"
RPM_HASH = "d64ca863e0e98b4f11ba670eb7cab337d2be68c457ac016940a499441b875c7ec10f9500cb3723f05d2526ad36b016654db6cbc57bdeb037c8fa8d00a8991c5f"

RPROVIDES:${PN} += "postgresql17-pg-cron \
postgresql17-pg-cron-llvmjit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
postgresql17-server"

inherit rpm
