SUMMARY = "Database connectivity for DB2"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Database connectivity for DB2."
LICENSE = "LGPL-2.1-only"

PV = "6.12.0"

RPM_NAME = "ibm-data-db2-6.12.0-8.11.aarch64.rpm"
RPM_HASH = "1fbdd7b8f7dcffa14eaa6f253373ffb2f076c6ffa195c8b689684b7fc1a64cc21d62611951998711bca0e750d705287a66fd30aada6d07e7f12633979fc0607d"

RPROVIDES:${PN} += "ibm-data-db2 \
mono-IBM.Data.DB2"

RDEPENDS:${PN} += "mono-System \
mono-System.Data \
mono-core \
mono-mscorlib"

inherit rpm
