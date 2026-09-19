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

PV = "1.6.3"

RPM_NAME = "postgresql14-pgaudit-1.6.3-9.2.aarch64.rpm"
RPM_HASH = "c04bd96e51c069b3377813a67462f4bdf56d0a0b71982425365a77b84f1c04c31ec738f8ab9ef3adffefbf88fcd4f99e4e5d47ec4983898de6a22ecc13cae866"

RPROVIDES:${PN} += "postgresql14-pgaudit \
postgresql14-pgaudit-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql14-server"

inherit rpm
