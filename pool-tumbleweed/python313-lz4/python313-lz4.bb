SUMMARY = "LZ4 Bindings for Python"
DESCRIPTION = "This package provides python bindings for the lz4 compression library."
LICENSE = "BSD-3-Clause"

PV = "4.4.5"

RPM_NAME = "python313-lz4-4.4.5-1.6.aarch64.rpm"
RPM_HASH = "a7abd951a6c167db2020a0134a57d340354f109d88f3b75e2935430e227c3641058d0d5289c715a48f7d657156d044809cc31e6cd41b4abca5289427242e97ba"

RPROVIDES:${PN} += "python3-lz4 \
python3.13dist-lz4 \
python313-lz4 \
python3dist-lz4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblz4.so.1 \
python-abi"

inherit rpm
