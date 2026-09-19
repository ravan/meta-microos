SUMMARY = "SQLite 3 backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the SQLite 3 backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.9.8"

RPM_NAME = "pdns-backend-sqlite3-4.9.8-1.12.aarch64.rpm"
RPM_HASH = "d6841b0a8fcf01b3965aeb989206cba54db3f3ff2de5166018b5dbda51e28036820467889504367a05be5198650e900ec007e440ccf14951c465aa361b240c2c"

RPROVIDES:${PN} += "libgsqlite3backend.so \
pdns-backend-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
pdns"

inherit rpm
