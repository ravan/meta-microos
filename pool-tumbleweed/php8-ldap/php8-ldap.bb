SUMMARY = "LDAP protocol support for PHP"
DESCRIPTION = "PHP interface to the Lightweight Directory Access Protocol (LDAP)."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-ldap-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "67b1e02eb5b283df2cb1fe0730582d691756f3898f481b7b298aa142e98e49cc8aeff70836e9b4bc84346f4cf797e21bac26f55d4f51e435f7b91d8f6b6dda38"

RPROVIDES:${PN} += "config-php8-ldap \
php-ldap \
php8-ldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
php"

inherit rpm
