SUMMARY = "Documentation for sqliteodbc"
DESCRIPTION = "ODBC driver for SQLite interfacing SQLite 3.x using the \
unixODBC or iODBC driver managers. This package contains generated \
documentation."
LICENSE = "BSD-2-Clause"

PV = "0.99991"

RPM_NAME = "sqliteodbc-doc-0.99991-2.8.aarch64.rpm"
RPM_HASH = "080aed3cf42deda5422555ec142d2660242082ca7502be4eb1cbfea6ebc4715c06a9931aa68f180f835e9d28cef8f7e7f35ffa2a97e43883e862169c3f16d2cd"

RPROVIDES:${PN} += "sqliteodbc-doc"

RDEPENDS:${PN} += ""

inherit rpm
