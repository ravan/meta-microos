SUMMARY = "File hosting service"
DESCRIPTION = "Nextcloud is a suite of client-server software for creating file \
hosting services and using them."
LICENSE = "AGPL-3.0-only"

PV = "34.0.4"

RPM_NAME = "nextcloud-34.0.4-1.1.noarch.rpm"
RPM_HASH = "5f99657cfa68f1943bfc79cb2c46a550cc1af2e93884682da27ed6d5636c9c57277bf26b9b0338985847013b4867a076bf44b1c2eeeeb99c655093bec92a70f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-nextcloud \
nextcloud"

RDEPENDS:${PN} += "/usr/bin/sh \
cron \
curl \
group-www \
libxml2 \
mariadb \
php-bz2 \
php-ctype \
php-curl \
php-dom \
php-fileinfo \
php-ftp \
php-gd \
php-iconv \
php-intl \
php-json \
php-ldap \
php-mbstring \
php-mysql \
php-openssl \
php-pear \
php-posix \
php-redis \
php-sodium \
php-xmlreader \
php-xmlwriter \
php-zip \
php-zlib \
systemd \
user-wwwrun"

inherit rpm
