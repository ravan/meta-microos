SUMMARY = "LMDB backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the LMDB backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.9.8"

RPM_NAME = "pdns-backend-lmdb-4.9.8-1.12.aarch64.rpm"
RPM_HASH = "2430b5a6648523c772f9ea67ba61095eabcd5e91255078254eea38207caa35714deb28d984862d8a0da0c2b25200766c4898447c6f31300ef7dfdad0f37c9834"

RPROVIDES:${PN} += "liblmdbbackend.so \
pdns-backend-lmdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-serialization.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
liblmdb-0.9.35.so \
libstdc++.so.6 \
libsystemd.so.0 \
pdns"

inherit rpm
