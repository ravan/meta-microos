SUMMARY = "FreeRADIUS support for OpenLDAP"
DESCRIPTION = "FreeRADIUS schemas for OpenLDAP."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.8"

RPM_NAME = "freeradius-server-ldap-schemas-3.2.8-1.8.aarch64.rpm"
RPM_HASH = "05df8d900ca101fcc082d4de93b7404810e4e26fe1cd070d9a5b43365b93373af528306f868f7454e8a3d84e895838b8604a081d4415e2d2b4e7d73ea283038a"

RPROVIDES:${PN} += "config-freeradius-server-ldap-schemas \
freeradius-server-ldap-schemas"

RDEPENDS:${PN} += "openldap2"

inherit rpm
