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

RPM_NAME = "mono-data-oracle-6.12.0-8.11.aarch64.rpm"
RPM_HASH = "c5c22af01e4afc2abb8b2dd03200c1d9c193ce62fd8aed96337daccba6e59f268cde230128471e79febcd9049a223797f138d0b77df71d04ce6cd51f06c8ba94"

RPROVIDES:${PN} += "mono-System.Data.OracleClient \
mono-data-oracle"

RDEPENDS:${PN} += "mono-System \
mono-System.Data \
mono-System.Drawing \
mono-System.EnterpriseServices \
mono-core \
mono-data \
mono-mscorlib"

inherit rpm
