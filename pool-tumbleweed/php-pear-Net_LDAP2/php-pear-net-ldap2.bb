SUMMARY = "Object oriented interface for searching and manipulating LDAP-entries"
DESCRIPTION = "Net_LDAP2 is the successor of Net_LDAP which is a clone of Perls Net::LDAPobject interface to directory servers. \
It does contain most of Net::LDAP's features but has some own too. \
With Net_LDAP2 you have: \
 * A simple object-oriented interface to connections, searches entries and filters. \
 * Support for tls and ldap v3. \
 * Simple modification, deletion and creation of ldap entries. \
 * Support for schema handling. \
 \
Net_LDAP2 layers itself on top of PHP's existing ldap extensions."
LICENSE = "LGPL-3.0-only"

PV = "2.3.0"

RPM_NAME = "php-pear-Net_LDAP2-2.3.0-1.8.noarch.rpm"
RPM_HASH = "9652046b54ff4fd55ea58c4d82e428149e46f75f8bff5c3a1d36b81a0a97ea05fd429774b1b4735c68b88df3ebc1b4a1e1037e8553f5c512515d364c3d893d13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "php-pear-Net-LDAP2 \
php5-pear-Net-LDAP2 \
php7-pear-Net-LDAP2"

RDEPENDS:${PN} += "/usr/bin/sh \
php-ldap \
php-pear"

inherit rpm
