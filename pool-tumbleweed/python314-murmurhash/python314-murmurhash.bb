SUMMARY = "Cython bindings for MurmurHash"
DESCRIPTION = "Cython bindings for MurmurHash"
LICENSE = "MIT"

PV = "1.0.15"

RPM_NAME = "python314-murmurhash-1.0.15-2.2.aarch64.rpm"
RPM_HASH = "6c92f4db8e24d1e49132b0f4bcabcd49e7293703d24b8b2bd2586a4432475f352a897f0d8b887436ff1af94ad5f4f085d9f07df1048dc0cd109090d0278bd26b"

RPROVIDES:${PN} += "python3.14dist-murmurhash \
python314-murmurhash \
python3dist-murmurhash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
