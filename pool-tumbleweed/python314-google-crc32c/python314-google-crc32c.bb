SUMMARY = "A python wrapper of the C library 'Google CRC32C'"
DESCRIPTION = "A python wrapper of the C library 'Google CRC32C'."
LICENSE = "Apache-2.0"

PV = "1.8.0"

RPM_NAME = "python314-google-crc32c-1.8.0-1.6.aarch64.rpm"
RPM_HASH = "59102df6d9a9133cbdb313cb9dcf8d94dde3609b2c071976b6a6330757e6c8abf9e9f436781cfb420918984895e004a19e529bab4d38e9c65b93452055a776de"

RPROVIDES:${PN} += "python3.14dist-google-crc32c \
python314-google-crc32c \
python3dist-google-crc32c"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrc32c.so.1 \
python-abi"

inherit rpm
