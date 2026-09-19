SUMMARY = "The GNU Transport Layer Security Library"
DESCRIPTION = "The GnuTLS library provides a secure layer over a reliable transport \
layer. Currently the GnuTLS library implements the proposed standards \
of the IETF's TLS working group."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.8.13"

RPM_NAME = "gnutls-3.8.13-3.1.aarch64.rpm"
RPM_HASH = "0615d761d032a5e2ee8b88fe534631901e0d88e2663e35007a8a5b021c9c045cbbf1bfcce38bf0a31571011470316acff15200df5b9b34324e997de0f7036aab"

RPROVIDES:${PN} += "gnutls"

RDEPENDS:${PN} += "crypto-policies \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls-dane.so.0 \
libgnutls-dane0 \
libgnutls.so.30 \
libjitterentropy3 \
libm.so.6 \
libtasn1.so.6"

inherit rpm
