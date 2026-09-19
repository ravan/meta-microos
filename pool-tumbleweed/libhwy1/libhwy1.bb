SUMMARY = "Efficient and performance-portable SIMD"
DESCRIPTION = "Highway is a C++ library that provides portable SIMD/vector intrinsics."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "libhwy1-1.4.0-1.3.aarch64.rpm"
RPM_HASH = "077ca940549d7cc8ea0db1ad3e793a024bad40048dc0582efe6b79dd175b65c9c6f71c48f4ac932c277e7a398f26b8af8d8ea14ac5eb3bca607d6f5e6b38d05a"

RPROVIDES:${PN} += "libhwy-contrib.so.1 \
libhwy-test.so.1 \
libhwy.so.1 \
libhwy1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
