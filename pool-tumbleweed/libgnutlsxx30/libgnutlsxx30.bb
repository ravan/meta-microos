SUMMARY = "C++ API for the GNU Transport Layer Security Library"
DESCRIPTION = "The GnuTLS library provides a secure layer over a reliable transport \
layer. Currently the GnuTLS library implements the proposed standards \
of the IETF's TLS working group."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.13"

RPM_NAME = "libgnutlsxx30-3.8.13-3.1.aarch64.rpm"
RPM_HASH = "97fbc6ab26c6ccd4cb9ab3f536c1da5dfc31543c40d1656ee8fe2d35d4b4e5c786129cf90e847ba8233a16fa72357fefe71f9dacd1e78fe6ef07982bbe82f498"

RPROVIDES:${PN} += "libgnutlsxx.so.30 \
libgnutlsxx30"

RDEPENDS:${PN} += "/sbin/ldconfig \
crypto-policies \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnutls.so.30 \
libstdc++.so.6"

inherit rpm
