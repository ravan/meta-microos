SUMMARY = "Cython bindings for MurmurHash"
DESCRIPTION = "Cython bindings for MurmurHash"
LICENSE = "MIT"

PV = "1.0.15"

RPM_NAME = "python313-murmurhash-1.0.15-2.2.aarch64.rpm"
RPM_HASH = "10ddd20ae130c61c031e047ab34856591da47cbecf093670a2f8719b88394f853b56710dd442e4f1a4836a3340b86fcaf99e3dc54db9fe794acaa47a744139fb"

RPROVIDES:${PN} += "python3-murmurhash \
python3.13dist-murmurhash \
python313-murmurhash \
python3dist-murmurhash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
