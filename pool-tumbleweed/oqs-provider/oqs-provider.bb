SUMMARY = "Quantum-safe crypto provider for OpenSSL"
DESCRIPTION = "This is a plugin/shared library making available quantum-safe cryptography \
(QSC) to OpenSSL 3.x installations via the Provider API. \
 \
Sample call: \
 \
openssl-3 ciphers -provider oqsprovider"
LICENSE = "MIT"

PV = "0.11.0.32"

RPM_NAME = "oqs-provider-0.11.0.32-1.1.aarch64.rpm"
RPM_HASH = "528ed6546fc82bf1498cf611b8967983b0ddefd6dab8627f3a5c1a6bcddad8cad32f4692e6f04a6152ff4cdea3f5477a0107c901a6e02dd9e47624c5badff02b"

RPROVIDES:${PN} += "oqs-provider"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
liboqs.so.9"

inherit rpm
