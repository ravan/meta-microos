SUMMARY = "Development files for the MPFRCX arithmetic computation library"
DESCRIPTION = "MPFRCX is a library for the arithmetic of univariate polynomials over \
arbitrary precision real or complex numbers. \
 \
This subpackage provides the development headers for it."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.3"

RPM_NAME = "mpfrcx-devel-0.6.3-1.17.aarch64.rpm"
RPM_HASH = "3f9c3797c3d63f6feea2e2e2204ca0d7af0d75ae4eacacc1ab3e7d8d381ea4fa5d6e3b22cc14e6d0996280aa43c15297ec107635e6429deeacaf3c290cfb053a"

RPROVIDES:${PN} += "mpfrcx-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gmp-devel \
libmpfrcx1 \
mpc-devel \
mpfr-devel"

inherit rpm
