SUMMARY = "SIMD Library for Evaluating Elementary Functions, vectorized libm and DFT"
DESCRIPTION = "SLEEF is a library that implements vectorized versions of C standard math \
functions. This library also includes DFT subroutines."
LICENSE = "BSL-1.0"

PV = "3.9.0"

RPM_NAME = "libsleef3-3.9.0-5.5.aarch64.rpm"
RPM_HASH = "2db33498f4e58af2f875b0214431084b86768395660cfa619e674bddf06169809ba91c8ee723a8514686f2d376c711aa82c8af33ead86cb66be43b06255a1e0f"

RPROVIDES:${PN} += "libsleef.so.3 \
libsleef3 \
libsleefgnuabi.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
