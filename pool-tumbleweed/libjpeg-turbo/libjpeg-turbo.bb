SUMMARY = "A SIMD-accelerated library for manipulating JPEG image files"
DESCRIPTION = "The libjpeg-turbo package contains a library of functions for manipulating \
JPEG images. It supports architecture-specific SIMD instructions, \
such as SSE/SSE2/AVX2, AltiVec, NEON, MIPS DSPR2, and Loongson MMI. \
 \
It also includes the following command line utilities: \
  djpeg - decompress a JPEG file to an image file \
  jpegtran - lossless transformation of JPEG files \
  rdjpgcom - display text comments from a JPEG file \
  wrjpgcom - insert text comments into a JPEG file \
  tjbench - a JPEG decompression/compression benchmark"
LICENSE = "BSD-3-Clause"

PV = "3.2.0"

RPM_NAME = "libjpeg-turbo-3.2.0-85.1.aarch64.rpm"
RPM_HASH = "64c0da10b52bb2dd87f1aa2c587e22c7911c292bd490232ef142aff19cdbe999a6084a54e3129502c2dafd35280bbeebf27ef0fa019a5bf43c2a77b3caff7dc5"

RPROVIDES:${PN} += "jpeg \
jpegtran \
libjpeg-turbo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6 \
libturbojpeg.so.0"

inherit rpm
