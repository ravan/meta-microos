SUMMARY = "Shared library from unbound"
DESCRIPTION = "Unbound is a validating, recursive, and caching DNS(SEC) resolver. \
 \
This package holds the shared library from unbound."
LICENSE = "BSD-3-Clause"

PV = "1.26.0"

RPM_NAME = "libunbound8-1.26.0-2.1.aarch64.rpm"
RPM_HASH = "9e989973d21ce5d3b9124b03aeb1cb35805396d4e67764f138d40dbd1ac3c8552a90d3f192309f3e04ffe0d874af7c054651f0aad9a89c854b89d7be3923fe64"

RPROVIDES:${PN} += "libunbound.so.8 \
libunbound8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libevent-2.1.so.7 \
libhiredis.so.1.3.0 \
libnghttp2.so.14 \
libngtcp2-crypto-ossl.so.0 \
libngtcp2.so.16 \
libprotobuf-c.so.1 \
libpython3.13.so.1.0 \
libsodium.so.26 \
libssl.so.3 \
unbound-anchor"

inherit rpm
