SUMMARY = "Test a LDAP server"
DESCRIPTION = "Monitor access to a Lightweight Directory Access Protocol (LDAP) server. \
 \
This package includes the 'check_ldap' and 'check_ldaps' plugins."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-ldap-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "2311b2c33da1477b6e8068150ff7659a4d8797c09ec70a3bce3d0df3e45e3f3ced7fe5f75c68a036775624ca4aa82c50f8b9c7f96c2d5d3965c583a7dbcce4ba"

RPROVIDES:${PN} += "monitoring-plugins-ldap \
nagios-plugins-ldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libldap.so.2"

inherit rpm
