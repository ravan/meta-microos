SUMMARY = "LDAP Module for ProFTPD"
DESCRIPTION = "This is the LDAP Module for ProFTPD"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.9c"

RPM_NAME = "proftpd-ldap-1.3.9c-2.1.aarch64.rpm"
RPM_HASH = "19707183988aff1c36d24d75ae7cfff49163ad9a69cbdc7befda20c56e13f7f8b0c46f81d389aa036ce44e96cbd17bbf5b88a9edf2376bb89edab62621bb5efe"

RPROVIDES:${PN} += "proftpd-ldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
proftpd"

inherit rpm
