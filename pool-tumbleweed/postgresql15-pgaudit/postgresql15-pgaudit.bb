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

PV = "1.7.1"

RPM_NAME = "postgresql15-pgaudit-1.7.1-9.2.aarch64.rpm"
RPM_HASH = "b8a49f55830df3def0751683114dafc9883cf53c9747a89b6d01462be85e8fda5b314b9bb84e1475c13ed46e0065c603f555ba58c62d8f78926f840f5200a642"

RPROVIDES:${PN} += "postgresql15-pgaudit \
postgresql15-pgaudit-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql15-server"

inherit rpm
