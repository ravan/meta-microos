SUMMARY = "Fast Fourier Transform library"
DESCRIPTION = "A Fast Fourier Transform based up on the principle, 'Keep It Simple, Stupid'. \
Kiss FFT is a very small, reasonably efficient, mixed radix FFT library that \
can use either fixed or floating point data types."
LICENSE = "BSD-3-Clause & Unlicense"

PV = "131.2.0"

RPM_NAME = "libkissfft-float131-131.2.0-2.4.aarch64.rpm"
RPM_HASH = "a55534ea3e6bd7c1bdfdfe5431dd828ec0c31d3aa609638dcb6807140e2c58b4d5ee1afa64af5b10c8d2a8e8a64066b579c5f4c7f52d19b6bd427f96b854dfe8"

RPROVIDES:${PN} += "libkissfft-float.so.131 \
libkissfft-float131"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmvec.so.1"

inherit rpm
