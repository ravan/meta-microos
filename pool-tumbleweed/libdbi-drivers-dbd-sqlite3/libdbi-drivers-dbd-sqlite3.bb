SUMMARY = "SQLite3 driver for libdbi"
DESCRIPTION = "This driver provides connectivity to SQLite 3.x database servers through the \
libdbi database independent abstraction layer. Switching a program's driver \
does not require recompilation or rewriting source code."
LICENSE = "LGPL-2.1+"

PV = "0.9.0.g53"

RPM_NAME = "libdbi-drivers-dbd-sqlite3-0.9.0.g53-4.8.aarch64.rpm"
RPM_HASH = "ed6b3943b93060664c1f767a493a7c29a1d9feaf2e3dd7174f826555a3bbab07f8f134bf2b13d8b6e91154ee9816b527e263edec161d3b18d46b90e749616d17"

RPROVIDES:${PN} += "libdbdsqlite3.so \
libdbi-drivers-dbd-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbi.so.3 \
libsqlite3.so.0"

inherit rpm
