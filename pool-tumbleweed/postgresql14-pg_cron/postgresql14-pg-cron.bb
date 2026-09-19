SUMMARY = "PostgreSQL module for simple job schedule"
DESCRIPTION = "pg_cron is a simple cron-based job scheduler for PostgreSQL (9.5 or higher) \
that runs inside the database as an extension. It uses the same syntax as \
regular cron, but it allows you to schedule PostgreSQL commands directly from \
the database."
LICENSE = "PostgreSQL"

PV = "1.6.7"

RPM_NAME = "postgresql14-pg_cron-1.6.7-1.2.aarch64.rpm"
RPM_HASH = "876a548250b82c0ad17055bc04bf204b9109290c179b1a83154a6a4a0a1efb2805c6004f626d45e6cba7cf6e4da86e8b099273d7aea1a525c4a0b897b5dbe4b0"

RPROVIDES:${PN} += "postgresql14-pg-cron \
postgresql14-pg-cron-llvmjit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
postgresql14-server"

inherit rpm
