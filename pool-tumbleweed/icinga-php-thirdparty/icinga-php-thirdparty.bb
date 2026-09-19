SUMMARY = "Icinga PHP Thirdparty for Icinga Web 2"
DESCRIPTION = "This package bundles all 3rd party PHP libraries \
used by Icinga Web products into one piece, \
which can be integrated as library into Icinga Web 2."
LICENSE = "MIT"

PV = "0.15.3"

RPM_NAME = "icinga-php-thirdparty-0.15.3-1.3.noarch.rpm"
RPM_HASH = "48e6f88827eedb9a9056d0ae21b70e7334d1194a611d4295d216147a85ef1794b12aafbabb042eb0f3dfa8a05256b0e897a4414ec8f841da2c9649a23a3e96e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icinga-php-common \
icinga-php-thirdparty"

RDEPENDS:${PN} += "/usr/bin/env \
icingaweb2 \
php \
php-curl \
php-iconv \
php-json \
php-soap \
php-sockets"

inherit rpm
