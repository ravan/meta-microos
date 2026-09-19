SUMMARY = "Icinga PHP Library for Icinga Web 2"
DESCRIPTION = "This project bundles all Icinga PHP libraries into one \
piece and can be integrated as library into Icinga Web 2."
LICENSE = "MIT"

PV = "0.19.2"

RPM_NAME = "icinga-php-library-0.19.2-1.3.noarch.rpm"
RPM_HASH = "54a5072c96308a14bb64627479844377d895706d2e2ec54e197a97d32b5ab229ce730d1373fd2cc96289a07727f24ac7c4f53a682cb413963738fc13812128a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icinga-php-common \
icinga-php-library"

RDEPENDS:${PN} += "icingaweb2 \
php \
php-gettext \
php-intl \
php-json \
php-openssl \
php-pdo"

inherit rpm
