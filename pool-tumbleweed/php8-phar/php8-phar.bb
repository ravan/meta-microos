SUMMARY = "PHP Archive extension for PHP"
DESCRIPTION = "The phar extension provides a way to put entire PHP applications into \
a single file called a 'phar' (PHP Archive) for distribution and \
installation. \
 \
In addition, the phar extension also provides a file-format \
abstraction method for creating and manipulating tar and zip files \
through the PharData class, much as PDO provides a unified interface \
for accessing different databases. Phar also can convert between tar, \
zip and phar file formats."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-phar-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "a97cdfadf043ee970ce27bae11d80015c886082ab4044ec57c10d40f0464460b7ce2db82e592c4ad880573bf7f6a6a53f8dd9140df53240f70d8c5544f1b045a"

RPROVIDES:${PN} += "config-php8-phar \
php-phar \
php8-phar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php \
php-zlib"

inherit rpm
