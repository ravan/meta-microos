SUMMARY = "A Lua binding for OpenSSL"
DESCRIPTION = "It is a binding for OpenSSL library to provide TLS/SSL communication. \
It takes an already established TCP connection and creates a secure \
session between the peers."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "lua53-luasec-1.3.1-3.3.aarch64.rpm"
RPM_HASH = "953e7f4786e472d48eee14649e4454515f14b1a86602dcd3b4db998d33853b539fb632dd54750c74d9f1b1b1a123396a641f45cac1c807d22e1aca0d25c7f89e"

RPROVIDES:${PN} += "lua53-luasec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
lua53 \
lua53-luasocket"

inherit rpm
