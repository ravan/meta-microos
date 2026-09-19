SUMMARY = "OpenSSL crypto plugin for XML Security Library"
DESCRIPTION = "OpenSSL plugin for XML Security Library provides OpenSSL based crypto services \
for the xmlsec library."
LICENSE = "MIT"

PV = "1.2.42"

RPM_NAME = "libxmlsec1-openssl1-1.2.42-1.8.aarch64.rpm"
RPM_HASH = "d66f2267576a7866154934e2f30ac431eaf37637b8a3dc27f01a01ea95a8957a427a0f7d98f7611e2884f6c90325b923d66c49ee0d069066272f0717ca8178cd"

RPROVIDES:${PN} += "libxmlsec1-openssl.so.1 \
libxmlsec1-openssl1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libxml2.so.16 \
libxmlsec1-1 \
libxmlsec1.so.1"

inherit rpm
