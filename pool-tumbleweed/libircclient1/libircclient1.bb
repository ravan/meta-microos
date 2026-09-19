SUMMARY = "Library implementing client-server IRC protocol"
DESCRIPTION = "It is designed to be small, fast, portable and compatible to RFC standards and most IRC clients."
LICENSE = "LGPL-2.0-or-later"

PV = "1.10"

RPM_NAME = "libircclient1-1.10-2.9.aarch64.rpm"
RPM_HASH = "01176675668b94c9a10f6b57c47736e1399b4280067d700246941784f3c579d7de460c85cf10ea8a38a8e9ac89e4e6f83e1e6c80d88b1cc8350d9310e5b14c36"

RPROVIDES:${PN} += "libircclient.so.1 \
libircclient1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
