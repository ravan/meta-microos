SUMMARY = "PHP binding for the Tidy HTML cleaner"
DESCRIPTION = "Tidy is an extension based on Libtidy (http://tidy.sourceforge.net) and allows \
a PHP developer to clean, repair, and traverse HTML, XHTML, and XML \
documents -- including ones with embedded scripting languages such as \
PHP or ASP within them using OO constructs."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-tidy-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "8299bb67fb402157656f1f6e89ad7356f5cfb9040af20723eece39c0abe7e02a08c44604d7d43dbf0106ea322f41d60c486a9a0a976cf21aed6b63f644e3da5f"

RPROVIDES:${PN} += "config-php8-tidy \
php-tidy \
php8-tidy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtidy.so.58 \
php"

inherit rpm
