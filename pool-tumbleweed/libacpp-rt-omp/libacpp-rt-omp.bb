SUMMARY = "OpenMP runtime for AdaptiveCpp"
DESCRIPTION = "AdaptiveCpp is an open implementation of SYCL and C++ standard parallelism \
for CPUs and GPUs from all vendors. \
 \
This package contains the OpenMP runtime for AdaptiveCpp."
LICENSE = "BSD-2-Clause"

PV = "25.10.0"

RPM_NAME = "libacpp-rt-omp-25.10.0-2.2.aarch64.rpm"
RPM_HASH = "9650fbe1d3602efac0e993a088fff49420e1b77fd91d16b03de7e5880d4be0801aa8c2e70ff4d04841d43625130147d779d0324a46ab3ca3522d11114400f3cc"

RPROVIDES:${PN} += "adaptivecpp-rt \
libacpp-rt-omp \
librt-backend-omp.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacpp-common.so \
libacpp-rt.so \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libllvm-to-backend.so \
libllvm-to-host.so \
libstdc++.so.6"

inherit rpm
