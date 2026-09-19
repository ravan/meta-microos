SUMMARY = "LZF compression"
DESCRIPTION = "This package handles LZF de/compression."
LICENSE = "PHP-3.01"

PV = "1.7.0"

RPM_NAME = "php8-lzf-1.7.0-2.20.aarch64.rpm"
RPM_HASH = "645b30d21178368843eb3fe0b35e32e7496c25907b09f5f5dc5ba77c69bed1fd38e8ae72203ce7a155096fd7d3fe6b0aaf6fcfd8b10744f01ad7c4a1ef548f01"

RPROVIDES:${PN} += "config-php8-lzf \
php-lzf \
php8-lzf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php-api \
php-zend-abi"

inherit rpm
