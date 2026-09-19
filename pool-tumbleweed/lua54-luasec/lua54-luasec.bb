SUMMARY = "A Lua binding for OpenSSL"
DESCRIPTION = "It is a binding for OpenSSL library to provide TLS/SSL communication. \
It takes an already established TCP connection and creates a secure \
session between the peers."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "lua54-luasec-1.3.1-3.3.aarch64.rpm"
RPM_HASH = "59206e85863f0514735e0a2ac4cac7baf98444079e077a0e3d941b60baaad7e1336913bb325cb61070226c229c21b6e9556b3303c70a379371e39f384377a359"

RPROVIDES:${PN} += "lua-luasec \
lua54-luasec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
lua54 \
lua54-luasocket"

inherit rpm
