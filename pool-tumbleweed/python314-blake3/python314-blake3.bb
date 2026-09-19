SUMMARY = "Python bindings for the BLAKE3 cryptographic hash function"
DESCRIPTION = "Python bindings for the official Rust implementation of the BLAKE3 \
cryptographic hash function. BLAKE3 is fast, secure, highly parallelizable and \
suitable for verified streaming and key derivation."
LICENSE = "Apache-2.0 | CC0-1.0"

PV = "1.0.9"

RPM_NAME = "python314-blake3-1.0.9-1.3.aarch64.rpm"
RPM_HASH = "6d2f5ad50d0f8e8a3fd0f26e2e19f72984869fa38f265b192cf61645ea66a41292e49284a71e7f713121a3eb7b226137a82759295ce9afbc1f02ac373ebfc23f"

RPROVIDES:${PN} += "python3.14dist-blake3 \
python314-blake3 \
python3dist-blake3"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
