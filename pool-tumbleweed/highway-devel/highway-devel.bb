SUMMARY = "Development files for Highway"
DESCRIPTION = "Highway is a C++ library that provides portable SIMD/vector intrinsics. \
 \
Development files for Highway."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "highway-devel-1.4.0-1.3.aarch64.rpm"
RPM_HASH = "78cb6c2089bbc299c549f96f6844b415a8564112f46a80488b743549c3f8ba9d65dc932c99bcf561eccdea5f073f7f2875f2d57ff5bbff2805a187e6c5f76e30"

RPROVIDES:${PN} += "cmake-hwy \
highway-devel \
pkgconfig-libhwy \
pkgconfig-libhwy-contrib \
pkgconfig-libhwy-test"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhwy1 \
pkgconfig-gtest"

inherit rpm
