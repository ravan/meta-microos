SUMMARY = "Remote backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the remote backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.9.8"

RPM_NAME = "pdns-backend-remote-4.9.8-1.12.aarch64.rpm"
RPM_HASH = "e52661bb3119fc0ee07a8ca87ce5f5491bbba31e9b50ed8c93c1e7055c2e0d770198ca621923ca8241b67df1e30980250455bbf74fe76aff020ac73d9c8d1f35"

RPROVIDES:${PN} += "libremotebackend.so \
pdns-backend-remote"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libzmq.so.5 \
pdns"

inherit rpm
