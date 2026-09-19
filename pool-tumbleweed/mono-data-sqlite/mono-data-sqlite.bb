SUMMARY = "Database connectivity for Mono"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Database connectivity for Mono."
LICENSE = "LGPL-2.1-only"

PV = "6.12.0"

RPM_NAME = "mono-data-sqlite-6.12.0-8.11.aarch64.rpm"
RPM_HASH = "39ae3bdd3fc20bdcc5051d7f03abb3fec349404123d80ae23ef3abee236e1e0563b88340c76e706abfd508785185445882263befdf040e35dcfbed196798e6e2"

RPROVIDES:${PN} += "mono-Mono.Data.Sqlite \
mono-data-sqlite"

RDEPENDS:${PN} += "mono-System \
mono-System.Data \
mono-System.Transactions \
mono-core \
mono-data \
mono-mscorlib"

inherit rpm
