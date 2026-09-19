SUMMARY = "A library for nonlinear optimization"
DESCRIPTION = "qd provides numeric types of twice the precision of IEEE double \
(106 mantissa bits, or approximately 32 decimal digits) and four \
times the precision of IEEE double (212 mantissa bits, or approximately \
64 decimal digits).  Due to features such as operator and function \
overloading, these facilities can be utilized with only minor modifications \
to conventional C++ and Fortran-90 programs."
LICENSE = "BSD-3-Clause-LBNL"

PV = "2.3.24"

RPM_NAME = "libqd0-2.3.24-1.9.aarch64.rpm"
RPM_HASH = "43b52d98597e33be19ecdcf50e6091f7c46b89b511122d0b180cfe4f983fc00f416e27196ba00757a4578cead3641d8d08584fe998a5e3ec48b63a5befe1fc87"

RPROVIDES:${PN} += "libqd-f-main.so.0 \
libqd.so.0 \
libqd0 \
libqdmod.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
