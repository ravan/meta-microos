SUMMARY = "SOAP/WSDL extension module for PHP"
DESCRIPTION = "This module provides SOAP support. \
 \
SOAP extension can be used to write SOAP Servers and Clients. It \
supports subsets of SOAP 1.1, SOAP 1.2 and WSDL 1.1 specifications."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-soap-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "6c46d24a41a54ec1d72297a6a269a3cd512c199f363cb806f1b9a7905656f7c675e4977e1187d1af0b6d5b1957416c0aa8011d69c4461a99f1aaaecce2debe40"

RPROVIDES:${PN} += "config-php8-soap \
php-soap \
php8-soap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.16 \
php"

inherit rpm
