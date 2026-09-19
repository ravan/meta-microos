SUMMARY = "Double Ratchet cryptographic library"
DESCRIPTION = "An implementation of the Double Ratchet cryptographic ratchet \
in C and C++, including an implementation of the Megolm cryptographic ratchet . \
This package contains python314 bindings for olm."
LICENSE = "Apache-2.0"

PV = "3.2.16"

RPM_NAME = "python314-olm-3.2.16-2.4.aarch64.rpm"
RPM_HASH = "41c7a54b588132dac6e27a74a59ab6593ae731c3389df8b1bfb2c10d40be7b8d09487b52d44d6933ab8eceea884b2d00acedc5c9a377f9ef5028fa496c3b7147"

RPROVIDES:${PN} += "python3.14dist-python-olm \
python314-olm \
python3dist-python-olm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libolm.so.3 \
libolm3 \
python-abi \
python314-cffi"

inherit rpm
