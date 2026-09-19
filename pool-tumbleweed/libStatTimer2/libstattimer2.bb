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
This subpackage provides shared libStatTimer library"
LICENSE = "Apache-2.0"

PV = "2.12.2"

RPM_NAME = "libStatTimer2-2.12.2-8.2.aarch64.rpm"
RPM_HASH = "cde896c89a54ea8e4e490ba7793c2d8caac82046acfe7b823a44486e1ae4eeabc6fb3366db54ad615c3d6f717c4eb9b3b025d0909a5a77e2476e1dbf7d2ee906"

RPROVIDES:${PN} += "libStatTimer.so.2 \
libStatTimer2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenCL.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
