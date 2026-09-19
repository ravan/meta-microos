SUMMARY = "C library for doing number theory"
DESCRIPTION = "FLINT (Fast Library for Number Theory) is a C library in support of \
computations in number theory. It is also a research project into \
algorithms in number theory. At this stage, FLINT consists mainly of \
fast integer and polynomial arithmetic and linear algebra."
LICENSE = "LGPL-3.0-or-later"

PV = "3.6.0"

RPM_NAME = "libflint24-3.6.0-1.2.aarch64.rpm"
RPM_HASH = "1801e02a0efa644e6c6399189019fd5ccee0829af568fba6d4734f1f553430f95d4177ee8b6f4a34ecd595e56274d30f9c46dc913da0564170ae116bc0e7f395"

RPROVIDES:${PN} += "libflint.so.24 \
libflint24"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpfr.so.6"

inherit rpm
