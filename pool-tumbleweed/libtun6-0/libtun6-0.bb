SUMMARY = "Linux tunnel configuration library used by miredo"
DESCRIPTION = "Miredo is an implementation of the 'Teredo: Tunneling IPv6 over UDP \
through NATs' proposed Internet standard (RFC4380). \
This package contains a library that takes care of configuring \
Linux tunnel interfaces."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.6"

RPM_NAME = "libtun6-0-1.2.6-5.19.aarch64.rpm"
RPM_HASH = "2702d3ed44ce2323375568cd86bc9a174f48500778c8041494e7e1c04732d3da2d2a49bca2265098cd2b39626e214e72104e24a3e75221687cc5249a61e23b0d"

RPROVIDES:${PN} += "libtun6-0 \
libtun6.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
