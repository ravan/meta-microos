SUMMARY = "Dependency Management for PHP"
DESCRIPTION = "Composer is a dependency manager tracking local dependencies of your projects \
and libraries."
LICENSE = "MIT"

PV = "2.10.3"

RPM_NAME = "php-composer2-2.10.3-3.1.noarch.rpm"
RPM_HASH = "1c680bac49cb6c6fbd0a4dadf31c8e3b57bb43e253d7972b17aa760086b8b2924e3779af903b86d4ca7e8a9f99ae9e25f3f4afd257a7cc1121c5417c70d73092"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "composer \
php-composer \
php-composer2 \
php7-composer"

RDEPENDS:${PN} += "php \
php-curl \
php-json \
php-mbstring \
php-openssl \
php-phar \
php-zip \
php-zlib"

inherit rpm
