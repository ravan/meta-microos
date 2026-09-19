SUMMARY = "Common library for AdaptiveCpp"
DESCRIPTION = "AdaptiveCpp is an open implementation of SYCL and C++ standard parallelism \
for CPUs and GPUs from all vendors. \
 \
This package contains the common library for AdaptiveCpp."
LICENSE = "BSD-2-Clause"

PV = "25.10.0"

RPM_NAME = "libacpp-common-25.10.0-2.2.aarch64.rpm"
RPM_HASH = "74c6348c9dfe06ee0e613d9eabf7194ceec137c9b52e8148b7c8829f7fada58a5842cd831e9665954f51b0dd1eef01203faa851f4dedfcd35dbd42143c17d70a"

RPROVIDES:${PN} += "libacpp-common \
libacpp-common.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
