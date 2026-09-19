SUMMARY = "Python implementation of QUIC and HTTP/3"
DESCRIPTION = "A library for the QUIC network protocol in Python. It features a minimal TLS \
1.3 implementation, a QUIC stack and an HTTP/3 stack."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python313-aioquic-1.3.0-1.6.aarch64.rpm"
RPM_HASH = "c0444384f17ea5a0a995c4c4aa695a56fbc938b1e07cb20e6d594ee61cc6c013dbc009b52fbc32a1fed39b24bca2524f82e7afd14cb06cbe96fd4d387911a351"

RPROVIDES:${PN} += "python3-aioquic \
python3.13dist-aioquic \
python313-aioquic \
python3dist-aioquic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
python-abi \
python313-certifi \
python313-cryptography \
python313-pyOpenSSL \
python313-pylsqpack \
python313-service-identity"

inherit rpm
