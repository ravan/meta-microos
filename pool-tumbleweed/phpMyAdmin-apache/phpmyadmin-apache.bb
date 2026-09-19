SUMMARY = "Apache configuration for phpMyAdmin"
DESCRIPTION = "This subpackage contains the Apache configuration files"
LICENSE = "GPL-2.0-or-later"

PV = "5.2.3"

RPM_NAME = "phpMyAdmin-apache-5.2.3-1.3.noarch.rpm"
RPM_HASH = "606fe102514ea89b8559727f05e16d82e5e781810963a543f43f431c36bcf1215fe670f512ad464d29cfbfa831296a3ac7a205462d01f93080a23aec9e9377f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-phpMyAdmin-apache \
phpMyAdmin-apache"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/a2enflag \
/usr/sbin/a2enmod \
apache2 \
mod-php-any \
php \
phpMyAdmin"

inherit rpm
