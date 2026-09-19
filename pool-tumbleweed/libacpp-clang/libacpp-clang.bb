SUMMARY = "Clang plugin for AdaptiveCpp"
DESCRIPTION = "AdaptiveCpp is an open implementation of SYCL and C++ standard parallelism \
for CPUs and GPUs from all vendors. \
 \
This package contains the Clang plugin for AdaptiveCpp."
LICENSE = "BSD-2-Clause"

PV = "25.10.0"

RPM_NAME = "libacpp-clang-25.10.0-2.2.aarch64.rpm"
RPM_HASH = "41e52df32596a9d2f71fc8b596f0ff0de691e8cfd51c630a6df89f734516248f6d19761f634204ad33ea1c035e4ba51f83fb770da43dca0198eec2ac2c275ad1"

RPROVIDES:${PN} += "libacpp-clang \
libacpp-clang.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacpp-bitcode \
libc.so.6 \
libstdc++.so.6"

inherit rpm
