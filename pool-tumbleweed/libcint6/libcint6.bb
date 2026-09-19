SUMMARY = "General Gaussian-type orbitals integrals for quantum chemistry"
DESCRIPTION = "libcint is an open source library for analytical Gaussian integrals. \
It provides C/Fortran API to evaluate one-electron / two-electron \
integrals for Cartesian / real-spherical / spinor Gaussian type functions."
LICENSE = "BSD-2-Clause"

PV = "6.1.3"

RPM_NAME = "libcint6-6.1.3-1.3.aarch64.rpm"
RPM_HASH = "0edeb902fb4138cef8e7b997424008b7c72b37981d974567a547fa68ba19f448e999d86c012669f263c718f13fead141f146a64d0a44bfd577b76b31fe3d03ea"

RPROVIDES:${PN} += "libcint.so.6 \
libcint6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
