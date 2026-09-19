SUMMARY = "A Lua binding for OpenSSL"
DESCRIPTION = "It is a binding for OpenSSL library to provide TLS/SSL communication. \
It takes an already established TCP connection and creates a secure \
session between the peers."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "lua55-luasec-1.3.1-3.3.aarch64.rpm"
RPM_HASH = "c99c1f5ca0038bbcfaade8a8b38b52174940d7ced1ccfb665ab498bc6bb98c740176ff93bd154afe6b0d952c9b2c0e982b7dfcfb28d63b0869a3ef2da71ff473"

RPROVIDES:${PN} += "lua55-luasec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
lua55 \
lua55-luasocket"

inherit rpm
