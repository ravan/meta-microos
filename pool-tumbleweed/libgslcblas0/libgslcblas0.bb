SUMMARY = "A standard C language APIs for BLAS from GNU Scientific Library"
DESCRIPTION = "This library provides a native C interface to BLAS routines. This is part of \
the GNU Scientific Library."
LICENSE = "GPL-3.0-or-later"

PV = "2.8"

RPM_NAME = "libgslcblas0-2.8-5.3.aarch64.rpm"
RPM_HASH = "15ed38e3ad36b5cb91374e2bae68326bee63ed5beb8e21b877f9db0cd078da6e32d1803f9647ee65ece60e853ac941e98d5943f38e54e9ea494ce7f953315300"

RPROVIDES:${PN} += "libgslcblas.so.0 \
libgslcblas0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
