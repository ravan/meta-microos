SUMMARY = "Library for libclfft"
DESCRIPTION = "The clFFT library is an OpenCL implementation of discrete \
Fast Fourier Transforms which: \
  * Works on CPU or GPU backends. \
  * Supports in-place or out-of-place transforms. \
  * Supports 1D, 2D, and 3D transforms with a batch size that can be greater \
    than 1. \
  * Supports planar (real and complex components in separate arrays) and \
    interleaved (real and complex components as a pair contiguous in memory) \
    formats. \
  * Supports dimension lengths that can be any mix of powers of 2, 3, and 5. \
  * Supports single and double precision floating point formats. \
 \
This subpackage provides shared library clFFT library"
LICENSE = "Apache-2.0"

PV = "2.12.2"

RPM_NAME = "libclFFT2-2.12.2-8.2.aarch64.rpm"
RPM_HASH = "73918dd0fd2bfb64d26101d95216ab53eb3c27e5b5fdc46cd58f72ac677e1ecd2ae00357f1b013acadf73e12f00ab595872b6fe342c13a3074bc64f8c9bf3dd1"

RPROVIDES:${PN} += "libclFFT.so.2 \
libclFFT2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenCL.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
