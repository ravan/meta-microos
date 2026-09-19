SUMMARY = "PostgreSQL module for simple job schedule"
DESCRIPTION = "pg_cron is a simple cron-based job scheduler for PostgreSQL (9.5 or higher) \
that runs inside the database as an extension. It uses the same syntax as \
regular cron, but it allows you to schedule PostgreSQL commands directly from \
the database."
LICENSE = "PostgreSQL"

PV = "1.6.7"

RPM_NAME = "postgresql15-pg_cron-1.6.7-1.2.aarch64.rpm"
RPM_HASH = "138445217a084416b08261fa8f34264c057f3826c2488c8ff80e9660db7974513742826037ddd570b2f0519f34d33f05f20833214657a1df3c08767ef3faf064"

RPROVIDES:${PN} += "postgresql15-pg-cron \
postgresql15-pg-cron-llvmjit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
postgresql15-server"

inherit rpm
