SUMMARY = "Kea DHCP server component library"
DESCRIPTION = "One of the many libraries the Kea DHCP server is composed of."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "libkea-exceptions55-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "dae59d16987ed46cc4655d7000937ae04e428ab33a91e0831ad30cf439721350a6295e187328b50a4a9cfaad310b0a75a5eee2e0870ff4b1d48a67821b4bea4a"

RPROVIDES:${PN} += "libkea-exceptions.so.55 \
libkea-exceptions55"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
