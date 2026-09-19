SUMMARY = "LDAP support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing LDAP support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.8"

RPM_NAME = "freeradius-server-ldap-3.2.8-1.8.aarch64.rpm"
RPM_HASH = "848321036e45bc049748f25614907cdf4e98eefb790b4aa1430b6beaeb3cfe64461f3aaf043d935be04c2d197909fe4ef1654b90677fb659eb9892cdb861a049"

RPROVIDES:${PN} += "config-freeradius-server-ldap \
freeradius-server-ldap"

RDEPENDS:${PN} += "freeradius-server \
group-radiusd \
libc.so.6 \
libldap.so.2"

inherit rpm
