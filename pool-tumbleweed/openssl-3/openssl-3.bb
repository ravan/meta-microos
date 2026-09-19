SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "openssl-3-3.5.3-8.3.aarch64.rpm"
RPM_HASH = "6ca64eed3ece621e1399c67795387cedcf8810ee2daf03133f70ee5a1e8140f3542cec6f108751c7be5760ccdb3d505709d207dd4b3b567a1ba1c58b9253388f"

RPROVIDES:${PN} += "openssl-3 \
ssl"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
crypto-policies \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libopenssl3 \
libssl.so.3 \
openssl"

inherit rpm
