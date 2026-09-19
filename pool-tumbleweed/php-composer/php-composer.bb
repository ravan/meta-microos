SUMMARY = "Dependency Management for PHP"
DESCRIPTION = "Composer is a dependency manager tracking local dependencies of your projects \
and libraries."
LICENSE = "MIT"

PV = "1.10.26"

RPM_NAME = "php-composer-1.10.26-2.10.noarch.rpm"
RPM_HASH = "260bed4ab55bf569266dda58369752faa07257fd8f6766a47a3fbef00c879f79017887be57c5b7e6515dbbda1726297936aa5bde4fe6d778337090b530f038ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "composer \
php-composer \
php5-composer \
php7-composer \
php8-composer"

RDEPENDS:${PN} += "php \
php-intl \
php-json \
php-mbstring \
php-openssl \
php-phar \
php-zip \
php-zlib"

inherit rpm
