SUMMARY = "LDAP based virtual hosts module for Lighttpd"
DESCRIPTION = "With LDAP based vhosting you can put the information where to look for \
the document-root of a given host into an LDAP database."
LICENSE = "BSD-3-Clause"

PV = "1.4.85"

RPM_NAME = "lighttpd-mod_vhostdb_ldap-1.4.85-1.2.aarch64.rpm"
RPM_HASH = "1cccca900afcd8802f3df423a15753a1f6598940d7bc0c33b33b182ba63e0c478b4aa5a0c3150d12ef649b9f91de4b6aef7e1a00ba646ea2e856ac041bcdf9a1"

RPROVIDES:${PN} += "lighttpd-mod-vhostdb-ldap"

RDEPENDS:${PN} += "libc.so.6 \
liblber.so.2 \
libldap.so.2 \
lighttpd"

inherit rpm
