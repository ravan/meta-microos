SUMMARY = "MySQL backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the MySQL backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.9.8"

RPM_NAME = "pdns-backend-mysql-4.9.8-1.12.aarch64.rpm"
RPM_HASH = "bf57b6ce05cc8805341d54c00feebfffa92f8e6fbe03bc29d439413ea72b27ccd8303ef39f47cf5e081c1b660978e50a77e9cac802c9e69e59379b70cf92ad02"

RPROVIDES:${PN} += "libgmysqlbackend.so \
pdns-backend-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmariadb.so.3 \
libstdc++.so.6 \
pdns"

inherit rpm
