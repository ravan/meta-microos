SUMMARY = "'Binary Calculator' extension for PHP"
DESCRIPTION = "Binary Calculator which supports numbers of any size and precision, \
represented as strings."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-bcmath-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "1bed55dd7188c15c521e1bdc08cada2b294017b86cc873272621f25968635b64effd3b5c8d3a2a3fa9c71b4a79b7f807ce8290704de038242884d44355260aa7"

RPROVIDES:${PN} += "config-php8-bcmath \
php-bcmath \
php8-bcmath"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
