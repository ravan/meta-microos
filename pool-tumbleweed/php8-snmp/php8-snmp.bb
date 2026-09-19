SUMMARY = "SNMP extension for PHP"
DESCRIPTION = "The SNMP extension provides a toolset for managing remote devices via \
the Simple Network Management Protocol. \
 \
As it is a wrapper around the underlying Net-SNMP library, all basic \
concepts are the same and the PHP functions change their behavior \
depending on the Net-SNMP configuration files and environment \
variables."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-snmp-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "2bb41c5b9d88936b372ac5d5df1c0c1a154f045e18e4aabce04473c47ccc73a36c1281c194384d793be78596c142813f9c8b9e5440d2f61961e04743888d36d3"

RPROVIDES:${PN} += "config-php8-snmp \
php-snmp \
php8-snmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.45 \
php"

inherit rpm
