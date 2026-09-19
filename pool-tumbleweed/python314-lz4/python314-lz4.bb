SUMMARY = "LZ4 Bindings for Python"
DESCRIPTION = "This package provides python bindings for the lz4 compression library."
LICENSE = "BSD-3-Clause"

PV = "4.4.5"

RPM_NAME = "python314-lz4-4.4.5-1.6.aarch64.rpm"
RPM_HASH = "2ffd591cc7b057dc2f8ba4e539b6ab8bc54c3e94b5d04b4ce27baf86f388c05677d605490b5c003dd6347856bd76f95bf73375013988e6c23ce8def67b0f12e3"

RPROVIDES:${PN} += "python3.14dist-lz4 \
python314-lz4 \
python3dist-lz4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblz4.so.1 \
python-abi"

inherit rpm
