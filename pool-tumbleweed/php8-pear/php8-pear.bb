SUMMARY = "PHP Extension and Application Repository"
DESCRIPTION = "PEAR is a code repository for PHP extensions and PHP library code \
similar to TeX's CTAN and Perl's CPAN. This package provides an access \
to the repository. \
 \
See https://pear.php.net/manual for more details."
LICENSE = "BSD-2-Clause"

PV = "1.10.26"

RPM_NAME = "php8-pear-1.10.26-1.3.noarch.rpm"
RPM_HASH = "5a6c81f20d915799a5a8a898b271289b0ae5b2e2633b83b9ca4b6d354771075c4d7b68e3e36c32727f78c57febe45228ce54074bbe4e2027048d7fc7eabd492c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-php8-pear \
php-pear \
php-pear-Archive-Tar \
php-pear-Console-Getopt \
php-pear-PEAR \
php-pear-Structures-Graph \
php-pear-XML-Util \
php8-pear"

RDEPENDS:${PN} += "/usr/bin/sh \
php8-cli \
php8-openssl \
php8-phar"

inherit rpm
