SUMMARY = "Apache configuration for PHP-FPM"
DESCRIPTION = "Configuration for Apache to pass all requests for PHP scripts to the \
PHP-FPM server using reverse proxy."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-fpm-apache-8.5.10-1.1.noarch.rpm"
RPM_HASH = "f9e0fa8dc4dcc694a1ee072889e2cfc23b1908059f18222c42646fb99f4dca8e15012b5620ad6185f2bdb29a341005801089c3ea52c9c67030a0cd2213ffc206"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-php8-fpm-apache \
php8-fpm-apache"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/a2enmod \
apache2 \
php-fpm"

inherit rpm
