SUMMARY = "Python bindings for the BLAKE3 cryptographic hash function"
DESCRIPTION = "Python bindings for the official Rust implementation of the BLAKE3 \
cryptographic hash function. BLAKE3 is fast, secure, highly parallelizable and \
suitable for verified streaming and key derivation."
LICENSE = "Apache-2.0 | CC0-1.0"

PV = "1.0.9"

RPM_NAME = "python313-blake3-1.0.9-1.3.aarch64.rpm"
RPM_HASH = "f14385c600e99364150e8a7776a0c967a4c583fded49d53ef3f003d6f9f8bca65501b4507d57cf6733830667c105a6ffa89486e29d64ba907fa847c404fc1a0e"

RPROVIDES:${PN} += "python3-blake3 \
python3.13dist-blake3 \
python313-blake3 \
python3dist-blake3"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
