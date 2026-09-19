SUMMARY = "MPC multiple-precision complex shared library"
DESCRIPTION = "MPC is a C library for the arithmetic of complex numbers with \
arbitrarily high precision and correct rounding of the result. It is \
built upon and follows the same principles as MPFR."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.1"

RPM_NAME = "libmpc3-1.4.1-1.3.aarch64.rpm"
RPM_HASH = "5699ac35976d09aff0016acaf0ea9df2d710596871c13522ec308452cec4e41b4845c58a72b00259a7792f9ddf0932a6b476b507c6fa5ea4dc2c7f40083eedf7"

RPROVIDES:${PN} += "libmpc.so.3 \
libmpc3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libmpfr.so.6"

inherit rpm
