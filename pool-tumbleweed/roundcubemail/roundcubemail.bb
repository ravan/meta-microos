SUMMARY = "A browser-based multilingual IMAP client"
DESCRIPTION = "Roundcube Webmail is a browser-based multilingual IMAP client with an \
application-like user interface. It provides MIME support, address \
book, folder manipulation, message searching and spell checking. \
 \
Roundcube Webmail is written in PHP and requires a MySQL database. \
The user interface is skinnable using XHTML and CSS 2."
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-or-later"

PV = "1.6.16"

RPM_NAME = "roundcubemail-1.6.16-2.2.noarch.rpm"
RPM_HASH = "ff89f64e55693e421351533ecb8336049205db20706cd456ea96b749da2004b3bacb8a031cc9750f5bd5655eebcb8c9451547b94ef6a2e5cf9b7e39e939c4eb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-roundcubemail \
roundcube-framework \
roundcubemail"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/php \
/usr/bin/sh \
mod-php-any \
php-dom \
php-exif \
php-gettext \
php-iconv \
php-intl \
php-json \
php-mbstring \
php-openssl \
php-pear-Auth-SASL \
php-pear-MDB2-Driver-mysqli \
php-pear-Mail-Mime \
php-pear-Net-IDNA2 \
php-pear-Net-LDAP2 \
php-pear-Net-SMTP \
php-pear-Net-Sieve \
php-pear-Net-Socket \
php-sockets \
user-wwwrun"

inherit rpm
