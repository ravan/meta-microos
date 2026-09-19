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

PV = "17.1"

RPM_NAME = "postgresql17-pgaudit-17.1-9.2.aarch64.rpm"
RPM_HASH = "aa6b77a082b25e5ce068aa8baa3254c60b74819445f4fa6103db5bc4c1c4b3a0c621911ccb3eacfd58829de6e484a43c8921c51eb793e53584699e94886f3b67"

RPROVIDES:${PN} += "postgresql17-pgaudit \
postgresql17-pgaudit-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql17-server"

inherit rpm
