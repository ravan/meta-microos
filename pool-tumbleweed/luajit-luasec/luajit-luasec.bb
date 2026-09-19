SUMMARY = "A Lua binding for OpenSSL"
DESCRIPTION = "It is a binding for OpenSSL library to provide TLS/SSL communication. \
It takes an already established TCP connection and creates a secure \
session between the peers."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "luajit-luasec-1.3.1-3.3.aarch64.rpm"
RPM_HASH = "de6b3b9d022867263a2b3dc03b94a8589f0234a9c1d064ce4212076b81daa39ba5652aad8328ee6fe17de90e237c29b38a82d3833677d90f467b77b59ff3a9e8"

RPROVIDES:${PN} += "luajit-luasec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
luajit \
luajit-luasocket"

inherit rpm
