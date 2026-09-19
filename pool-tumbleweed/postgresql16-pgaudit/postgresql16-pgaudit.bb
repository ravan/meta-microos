SUMMARY = "An auditing module for PostgreSQL"
DESCRIPTION = "This is the initial version of an auditing module for Postgres. \
 \
It collects audit events from various sources and logs them in CSV format \
including a timestamp, user information, details of objects affected (if any), \
and the fully-qualified command text (whenever available). \
 \
All DDL, DML (including SELECT), and utility commands are supported. These \
are categorised as described below, and audit logging for each group of \
commands may be enabled or disabled by the superuser. Once enabled, however, \
audit logging may not be disabled by a user."
LICENSE = "PostgreSQL"

PV = "16.1"

RPM_NAME = "postgresql16-pgaudit-16.1-9.2.aarch64.rpm"
RPM_HASH = "e419b36570b826b07e666747a3d472a835e97d5cab4d41d248b7bb89e62307c0cac917ef3610aa6b354f104431bf0912bc7f32dd39209b89e3a1db02e00b120d"

RPROVIDES:${PN} += "postgresql16-pgaudit \
postgresql16-pgaudit-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql16-server"

inherit rpm
