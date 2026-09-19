SUMMARY = "Interpreter for the PHP scripting language version 8"
DESCRIPTION = "PHP is a server-side HTML embedded scripting language designed \
primarily for web development but also used as a general-purpose \
programming language. \
 \
This package contains the base files for all subpackages and \
must be installed in order to use PHP. Additionally, extension \
modules and server modules (e.g. for Apache) may be installed."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "36a3b24a96b8c8a6ea97e3fa57d8f400c22db2a15babb7cd6ac6638ea2f27662038fe7951648d46da5bb560377ecc2d062de15157c0886913269fb6496c9d022"

RPROVIDES:${PN} += "php \
php-api \
php-date \
php-filter \
php-hash \
php-json \
php-opcache \
php-pcre \
php-reflection \
php-session \
php-simplexml \
php-spl \
php-xml \
php-zend-abi \
php8 \
zend"

RDEPENDS:${PN} += "group-www \
php-sapi \
timezone \
user-wwwrun"

inherit rpm
