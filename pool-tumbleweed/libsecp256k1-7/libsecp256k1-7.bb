SUMMARY = "Optimized C library for EC operations on curve secp256k1"
DESCRIPTION = "The libsecp256k1 library is a work in progress and is being used to research best practices. Use at your own risk. \
 \
Features: \
- secp256k1 ECDSA signing/verification and key generation. \
- Adding/multiplying private/public keys. \
- Serialization/parsing of private keys, public keys, signatures. \
- Constant time, constant memory access signing and pubkey generation. \
- Derandomized DSA (via RFC6979 or with a caller provided function.) \
- Very efficient implementation."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "libsecp256k1-7-0.8.0-1.1.aarch64.rpm"
RPM_HASH = "8ccda302aa99818a514b18dfe4a17884c762a5e348728a4db5fbc5364e5a9576d92fc8f054fa60a6f75f115112197cb8b4b96c6b53c970cad8e9e3e1698dcc78"

RPROVIDES:${PN} += "libsecp256k1-7 \
libsecp256k1.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
