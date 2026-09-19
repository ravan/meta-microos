SUMMARY = "Bitcode for AdaptiveCpp"
DESCRIPTION = "AdaptiveCpp is an open implementation of SYCL and C++ standard parallelism \
for CPUs and GPUs from all vendors. \
 \
This package contains the bitcode for AdaptiveCpp JIT compilation."
LICENSE = "BSD-2-Clause"

PV = "25.10.0"

RPM_NAME = "libacpp-bitcode-25.10.0-2.2.noarch.rpm"
RPM_HASH = "4fa54d43a3e34728d94f0c3719a18c4964cbbd06dc2ce13d0c02382876543e789464c7205063d5acbf5de67f1987ffb43b1f607e297406fb9f47a3dfa815525c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libacpp-bitcode"

RDEPENDS:${PN} += ""

inherit rpm
