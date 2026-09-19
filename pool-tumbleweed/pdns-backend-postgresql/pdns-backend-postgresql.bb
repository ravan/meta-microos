SUMMARY = "PostgreSQL backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the PostgreSQL backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.9.8"

RPM_NAME = "pdns-backend-postgresql-4.9.8-1.12.aarch64.rpm"
RPM_HASH = "a9bca6320d27096dda429cc713ca41108d8d8c004f9988600f7515a03c15c05ee3072e1f5874e22a6a5cec53ddcd0cc79f4f278673ba65e0ed6b3a3c1ba0d15b"

RPROVIDES:${PN} += "libgpgsqlbackend.so \
pdns-backend-postgresql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpq.so.5 \
libstdc++.so.6 \
pdns"

inherit rpm
