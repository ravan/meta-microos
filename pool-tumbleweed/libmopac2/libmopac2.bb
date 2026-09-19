SUMMARY = "Dynamic libraries from openmopac"
DESCRIPTION = "MOPAC is a computational chemistry software package that implements a \
variety of semi-empirical quantum chemistry methods based on the neglect of \
diatomic differential overlap (NDDO) approximation and fit primarily for \
gas-phase thermochemistry \
 \
This package contains dynamic libraries."
LICENSE = "Apache-2.0"

PV = "23.2.5"

RPM_NAME = "libmopac2-23.2.5-1.3.aarch64.rpm"
RPM_HASH = "7c3c2f3bcc0a05e43fe6b28e0f16a02b63abc1a9629d192025c007d57b8a4bbbc26d8c6e2444c2d7213321369191afd335f639274402accf92af201daa6209f1"

RPROVIDES:${PN} += "libmopac.so.2 \
libmopac2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libgomp.so.1 \
liblapack.so.3 \
libm.so.6 \
libmvec.so.1"

inherit rpm
