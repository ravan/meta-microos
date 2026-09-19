SUMMARY = "Keccak family hashing library, including SHA-3"
DESCRIPTION = "libkeccak is a bit-oriented lanewise implementation of the Keccak \
family with support for extend output size, state marshalling, \
algorithm tuning with implicit parameters, secure erasure of \
sensitive data, and HMAC. \
 \
A subset of Keccak was specified by NIST as SHA-3 (Secure Hash Algorithm 3)."
LICENSE = "ISC"

PV = "1.4.3"

RPM_NAME = "libkeccak1-1.4.3-1.3.aarch64.rpm"
RPM_HASH = "98e014caa48a8a4350e4fffa93cd36ea8c779037f4643ecaf8925c862cd120f72beca4a715a393a9ce39465ba013e251b25e8d3a6947214f32c1fb1bf7b78866"

RPROVIDES:${PN} += "libkeccak.so.1 \
libkeccak1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
