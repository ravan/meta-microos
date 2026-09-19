SUMMARY = "Shared library for bandicoot"
DESCRIPTION = "Bandicoot is a GPU linear algebra library (matrix maths) for the C++ language, \
aiming towards a good balance between speed and ease of use. It provides \
high-level syntax and functionality deliberately similar to Matlab. \
 \
This package provides the shared library for bandicoot."
LICENSE = "Apache-2.0"

PV = "4.0.1"

RPM_NAME = "libbandicoot4-4.0.1-1.3.aarch64.rpm"
RPM_HASH = "5335457f9264389590954855bd112bc69ca1b620c9b1a3ed87b47817a38ea6f04343fb9bd8228aebfcbad04c2dfca9b389868dfea92adcaaceeef9d72dcba373"

RPROVIDES:${PN} += "libbandicoot.so.4 \
libbandicoot4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenCL.so.1 \
libc.so.6 \
libclBLAS.so.2 \
libgcc-s.so.1 \
libm.so.6 \
libopenblas.so.0 \
libstdc++.so.6"

inherit rpm
