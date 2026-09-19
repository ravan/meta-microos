SUMMARY = "Kea DHCP server component library"
DESCRIPTION = "One of the many libraries the Kea DHCP server is composed of."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "libkea-dns84-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "7933becd74a81151f19224a521afae2fc271c02a7713e6dbade4158da71240ff272542f84c64f19a83308462b92c78803d8ba024acdd9c611d4c8b5ae2377b0a"

RPROVIDES:${PN} += "libkea-dns.so.84 \
libkea-dns84"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-cryptolink.so.76 \
libkea-exceptions.so.55 \
libkea-util.so.118 \
libstdc++.so.6"

inherit rpm
