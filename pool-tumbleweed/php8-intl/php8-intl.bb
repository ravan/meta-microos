SUMMARY = "ICU integration for PHP"
DESCRIPTION = "The internationalization (intl) extension is a wrapper for the ICU \
library, enabling PHP programmers to perform UCA (Unicode Collation \
Algorithm) conformant collation as well as date, time, number and \
currency formatting in their scripts."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-intl-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "260bff5cb761332e4cc27942fa78ff47c80e6368cf435317cc2c69df7be9a28874f3884372cc28f5ddf539cfbb6cb44e727efaafd3856404007ced35ccdd41ac"

RPROVIDES:${PN} += "config-php8-intl \
php-intl \
php8-intl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.78 \
libicuio.so.78 \
libicuuc.so.78 \
libstdc++.so.6 \
php"

inherit rpm
