SUMMARY = "CLucene cross-platform layer"
DESCRIPTION = "This package creates a library that is used in all the CLucene \
projects. It provides cross-platform macros and functions, as well as \
things like cl_* string macros, file handling functions, replacement \
functions, etc."
LICENSE = "Apache-2.0 | LGPL-2.1-only"

PV = "2.3.3.4"

RPM_NAME = "libclucene-shared1-2.3.3.4-19.10.aarch64.rpm"
RPM_HASH = "8e053c47f12ed3cf5b86bd151d5ee73caf62ec6b3053d0278112aaea90dfa8c2f3b335ac72b89c946cbb91b8b2234b05b15f7abe356587629ed3c9d6460bc6ee"

RPROVIDES:${PN} += "libclucene-shared.so.1 \
libclucene-shared1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
