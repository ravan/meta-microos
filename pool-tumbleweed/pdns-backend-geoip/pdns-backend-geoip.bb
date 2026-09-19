SUMMARY = "GeoIP backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the GeoIP backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.9.8"

RPM_NAME = "pdns-backend-geoip-4.9.8-1.12.aarch64.rpm"
RPM_HASH = "ec8f487659fe9bf4221f37b05d72b512551e0c5765c8db1dd966dfd77449a945dcd4c32ef0b7f104b3bbeae00ccbeb26ed8c796ac7269dbd5cd71030365c7de7"

RPROVIDES:${PN} += "libgeoipbackend.so \
pdns-backend-geoip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmaxminddb.so.0 \
libstdc++.so.6 \
libyaml-cpp.so.0.9 \
pdns"

inherit rpm
