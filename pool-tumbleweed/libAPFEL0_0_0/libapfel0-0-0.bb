SUMMARY = "A Probability Distribution Function Evolution Library"
DESCRIPTION = "APFEL is a library to perform the combined QCD+QED DGLAP \
evolution of parton distributions. \
 \
This package provides the shared libraries for apfel."
LICENSE = "GPL-3.0-or-later"

PV = "3.1.1"

RPM_NAME = "libAPFEL0_0_0-3.1.1-2.15.aarch64.rpm"
RPM_HASH = "a8feae8078f0eaa3a62e81e538eb49cc5dae2bc3f4ba4224f55a244974bc209184cd8718b7ac97dc578c0d32e7b47f77c4c74ab566ffc157538cf3c7e20e4d05"

RPROVIDES:${PN} += "libAPFEL.so.0.0.0 \
libAPFEL0-0-0 \
libAPFELevol.so.0.0.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLHAPDF-6.5.5.so \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmvec.so.1 \
libstdc++.so.6"

inherit rpm
