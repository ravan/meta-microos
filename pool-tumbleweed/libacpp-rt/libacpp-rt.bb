SUMMARY = "Runtime library for AdaptiveCpp"
DESCRIPTION = "AdaptiveCpp is an open implementation of SYCL and C++ standard parallelism \
for CPUs and GPUs from all vendors. \
 \
This package contains the runtime library for AdaptiveCpp."
LICENSE = "BSD-2-Clause"

PV = "25.10.0"

RPM_NAME = "libacpp-rt-25.10.0-2.2.aarch64.rpm"
RPM_HASH = "9ccc8c1802a01629816d5c939a6823d58c82cb7d3fba336a38f1022f834e6189c12ec8b652fdae355e3bb6d30f0192b0ffb87db6f7eb6a185b0a95158c5a9481"

RPROVIDES:${PN} += "libacpp \
libacpp-rt \
libacpp-rt.so \
libadaptivecpp"

RDEPENDS:${PN} += "adaptivecpp-rt \
ld-linux-aarch64.so.1 \
libacpp-common.so \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
