SUMMARY = "Python implementation of QUIC and HTTP/3"
DESCRIPTION = "A library for the QUIC network protocol in Python. It features a minimal TLS \
1.3 implementation, a QUIC stack and an HTTP/3 stack."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python314-aioquic-1.3.0-1.6.aarch64.rpm"
RPM_HASH = "ff9279b825a0c054293ee816b7fa1c01a14586a9583cec1339b4679a586a9cb0748a4c1902cf302e68d3664b27e467dc943fe000ec163cc5466ba66af81970f1"

RPROVIDES:${PN} += "python3.14dist-aioquic \
python314-aioquic \
python3dist-aioquic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
python-abi \
python314-certifi \
python314-cryptography \
python314-pyOpenSSL \
python314-pylsqpack \
python314-service-identity"

inherit rpm
