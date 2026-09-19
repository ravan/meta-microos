SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "libopenssl3-3.5.3-8.3.aarch64.rpm"
RPM_HASH = "4edd1ba52f14e1343228df7efc4391f582a23a376c83c4e58c963d86618d1c5ad3d165783812c257f6e0ce85bb4928146deb2de2cb541a9796bf00626ada4847"

RPROVIDES:${PN} += "config-libopenssl3 \
libcrypto.so.3 \
libopenssl3 \
libopenssl3-hmac \
libssl.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/env \
/usr/bin/sh \
crypto-policies \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjitterentropy.so.3 \
libz.so.1"

inherit rpm
