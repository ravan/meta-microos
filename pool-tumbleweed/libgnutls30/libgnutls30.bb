SUMMARY = "The GNU Transport Layer Security Library"
DESCRIPTION = "The GnuTLS library provides a secure layer over a reliable transport \
layer. Currently the GnuTLS library implements the proposed standards \
of the IETF's TLS working group."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.13"

RPM_NAME = "libgnutls30-3.8.13-3.1.aarch64.rpm"
RPM_HASH = "9589fd4224a64bb9d2c2b6d1f2403e3f7410c64c5a26b2be5d5d8ead7d19b7d1ae3cc14f688fafeeac4d04a6114ed4ed97a26a582b939d11771fac5b2b6fe92c"

RPROVIDES:${PN} += "libgnutls.so.30 \
libgnutls30 \
libgnutls30-hmac"

RDEPENDS:${PN} += "/sbin/ldconfig \
crypto-policies \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libhogweed.so.6 \
libidn2.so.0 \
libjitterentropy.so.3 \
libleancrypto.so.1 \
libnettle.so.8 \
libp11-kit.so.0 \
libtasn1.so.6 \
libunistring.so.5"

inherit rpm
