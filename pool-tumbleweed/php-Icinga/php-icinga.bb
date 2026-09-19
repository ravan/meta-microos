SUMMARY = "Icinga Web PHP library"
DESCRIPTION = "Icinga Web PHP and vendor libraries."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "php-icinga-2.13.0-1.9.noarch.rpm"
RPM_HASH = "e00ba297dc6f8adac232f55b5cf07a6b3f00bf904fedd4d7846572b297cdcec201cd1bf359e6160db440ec13f3be4e60dc2e0a1e5aafa4000bef1b9da33591d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-vendor-HTMLPurifier \
icingaweb2-vendor-JShrink \
icingaweb2-vendor-Parsedown \
icingaweb2-vendor-dompdf \
icingaweb2-vendor-lessphp \
icingaweb2-vendor-zf1 \
php-Icinga \
php-icinga"

RDEPENDS:${PN} += "icinga-php-library \
icinga-php-thirdparty \
php-curl \
php-dom \
php-fileinfo \
php-gd \
php-gettext \
php-intl \
php-json \
php-ldap \
php-mbstring \
php-openssl \
php-pdo \
php-pdo-mysql \
php-pdo-pgsql \
php-posix \
php-xml"

inherit rpm
