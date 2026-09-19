SUMMARY = "Implementation of Hypertext Transfer Protocol version 2 in C"
DESCRIPTION = "This is an implementation of Hypertext Transfer Protocol version 2. \
 \
The framing layer of HTTP/2 is implemented as a form of reusable C library. \
On top of that, we have implemented HTTP/2 client, server and proxy. We \
have also developed load test and benchmarking tool for HTTP/2. \
 \
HPACK encoder and decoder are available as public API."
LICENSE = "MIT"

PV = "1.70.0"

RPM_NAME = "nghttp2-1.70.0-1.1.aarch64.rpm"
RPM_HASH = "3330fa1e46dc88e21f60faebd23e7295f74f4b900be842bc885a8c6acc6e3fc75c85a2be2c00ab5f7a2e25b00aa591222678cb04bdee3c1d41e5788180b4b7f4"

RPROVIDES:${PN} += "nghttp2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcares.so.2 \
libcrypto.so.3 \
libev.so.4 \
libgcc-s.so.1 \
libjansson.so.4 \
libjemalloc.so.2 \
libm.so.6 \
libnghttp2.so.14 \
libnghttp3.so.9 \
libngtcp2-crypto-ossl.so.0 \
libngtcp2.so.16 \
libssl.so.3 \
libstdc++.so.6 \
libsystemd.so.0 \
libxml2.so.16 \
libz.so.1"

inherit rpm
