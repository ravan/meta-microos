SUMMARY = "ODBC backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the ODBC backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.9.8"

RPM_NAME = "pdns-backend-godbc-4.9.8-1.12.aarch64.rpm"
RPM_HASH = "33cb53a18d7f7463209c538fbc6fc530ee21ce7711a6624a963c5778eb36806366497390410de456461074a64f7bad6f83c3934f4025ad66130cd9ffb427905e"

RPROVIDES:${PN} += "libgodbcbackend.so \
pdns-backend-godbc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libodbc.so.2 \
libstdc++.so.6 \
pdns"

inherit rpm
