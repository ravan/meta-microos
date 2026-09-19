SUMMARY = "GAP: Integration of mpfr, mpfi, mpc, fplll and cxsc in GAP"
DESCRIPTION = "The Float package allows GAP to manipulate floating-point numbers \
with arbitrary precision. It is based on MPFR, MPFI, MPC, CXSC, \
FPLLL."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.10"

RPM_NAME = "gap-float-1.0.10-1.3.aarch64.rpm"
RPM_HASH = "be83415266e408ab6f70f6a0f29269ab69ca8a275ce2c4cf6d9f34fee7b86cdd3df0535810c57c8f3c27a29e5c0adc0f376035c9f27810166bf1040909a73634"

RPROVIDES:${PN} += "gap-float"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
gap-gapdoc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfplll.so.9 \
libgcc-s.so.1 \
libmpc.so.3 \
libmpfi.so.0 \
libmpfr.so.6 \
libstdc++.so.6"

inherit rpm
