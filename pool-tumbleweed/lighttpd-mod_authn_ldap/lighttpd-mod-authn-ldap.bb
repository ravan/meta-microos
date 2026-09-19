SUMMARY = "LDAP authentication in lighttpd"
DESCRIPTION = "A module to provide LDAP authentication in lighttpd."
LICENSE = "BSD-3-Clause"

PV = "1.4.85"

RPM_NAME = "lighttpd-mod_authn_ldap-1.4.85-1.2.aarch64.rpm"
RPM_HASH = "3169ccb07bad5b9f4b6e11ddc254064f6839b88e5f24991df9faaabcd1cc8a62e4c8fbd90395ab4763331b0ae6bb633b920a059a17dcf98d9149ea61a0946cc5"

RPROVIDES:${PN} += "lighttpd-mod-authn-ldap"

RDEPENDS:${PN} += "libc.so.6 \
liblber.so.2 \
libldap.so.2 \
lighttpd"

inherit rpm
