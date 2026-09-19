SUMMARY = "Multi-precision floating-point interval arithmetic computation library"
DESCRIPTION = "The CM software implements the construction of ring class fields of \
imaginary quadratic number fields and of elliptic curves with complex \
multiplication via floating point approximations. \
 \
It includes libraries that can be called from within a C program."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.4"

RPM_NAME = "libcm1-0.4.4-1.7.aarch64.rpm"
RPM_HASH = "2619df802313af4e0a159d90b36100f01a9f9d20b10d155677a6d871268b23ff8b143c4f97c53f75082f8370d9d7c3a1b8779ec4288c2b23b3b2e3297a226bf4"

RPROVIDES:${PN} += "libcm.so.1 \
libcm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libflint.so.24 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libmpfrcx.so.1 \
libpari-gmp-tls.so.9 \
libz.so.1"

inherit rpm
