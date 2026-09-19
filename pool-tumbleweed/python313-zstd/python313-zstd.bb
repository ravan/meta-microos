SUMMARY = "ZSTD Bindings for Python"
DESCRIPTION = "ZSTD Bindings for Python."
LICENSE = "BSD-2-Clause"

PV = "1.5.7.3"

RPM_NAME = "python313-zstd-1.5.7.3-1.6.aarch64.rpm"
RPM_HASH = "f018ea40a7606b981a6d6c085457c6413d411abac33dce2d0102095af66f5483c44645eb130a3873d9e667336e7a423a63c7f87abbbe7eb9ee3a93b8718d8f11"

RPROVIDES:${PN} += "python3-zstd \
python3.13dist-zstd \
python313-zstd \
python3dist-zstd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzstd.so.1 \
python-abi"

inherit rpm
