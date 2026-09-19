SUMMARY = "ZSTD Bindings for Python"
DESCRIPTION = "ZSTD Bindings for Python."
LICENSE = "BSD-2-Clause"

PV = "1.5.7.3"

RPM_NAME = "python314-zstd-1.5.7.3-1.6.aarch64.rpm"
RPM_HASH = "e979983b34789c4b60834c22b69fcbb5164a185636626585d638012401e15c795508c6041d273d0bbbda377c1e8de8044f25df0344d42b61a3d68aaf72d71b28"

RPROVIDES:${PN} += "python3.14dist-zstd \
python314-zstd \
python3dist-zstd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzstd.so.1 \
python-abi"

inherit rpm
