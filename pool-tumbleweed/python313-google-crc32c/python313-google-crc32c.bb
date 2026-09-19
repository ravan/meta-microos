SUMMARY = "A python wrapper of the C library 'Google CRC32C'"
DESCRIPTION = "A python wrapper of the C library 'Google CRC32C'."
LICENSE = "Apache-2.0"

PV = "1.8.0"

RPM_NAME = "python313-google-crc32c-1.8.0-1.6.aarch64.rpm"
RPM_HASH = "a27ec52c5ae910cea0d448b2d0f031099f792a47df7851e8c16ba67636bb65148fd88ca2da46c1bb62c3a42b179bed63e392df7bbe53974be9f3a918208e9304"

RPROVIDES:${PN} += "python3-google-crc32c \
python3.13dist-google-crc32c \
python313-google-crc32c \
python3dist-google-crc32c"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrc32c.so.1 \
python-abi"

inherit rpm
