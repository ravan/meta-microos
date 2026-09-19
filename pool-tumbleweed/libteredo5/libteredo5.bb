SUMMARY = "Teredo implementation library used by miredo"
DESCRIPTION = "Miredo is an implementation of the 'Teredo: Tunneling IPv6 over UDP \
through NATs' proposed Internet standard (RFC4380). \
This package contains a Teredo implementation."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.6"

RPM_NAME = "libteredo5-1.2.6-5.19.aarch64.rpm"
RPM_HASH = "85b88c6b907fe3368b2739fcb25310c79347fc2e4399e295ff13133387bc932163964700e1bdc4ee5b7bc121d5376e5caa7cd1e00f859c32f2cd698e04c7289a"

RPROVIDES:${PN} += "libteredo.so.5 \
libteredo5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libJudy.so.1 \
libc.so.6"

inherit rpm
