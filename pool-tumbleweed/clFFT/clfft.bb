SUMMARY = "OpenCL FFT library"
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
  * Supports single and double precision floating point formats."
LICENSE = "Apache-2.0"

PV = "2.12.2"

RPM_NAME = "clFFT-2.12.2-8.2.aarch64.rpm"
RPM_HASH = "96f8244a4be6c5f3c23f852384498164d4064285ae2f412f8ae8a18a5eb2d9aac2eebdb6e3fe4e1c405dbd16db2c587477f2c50e4d971d769c8a242d9d08f448"

RPROVIDES:${PN} += "clFFT"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenCL.so.1 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libclFFT.so.2 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
