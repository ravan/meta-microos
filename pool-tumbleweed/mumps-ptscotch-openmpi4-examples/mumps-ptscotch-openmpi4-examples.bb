SUMMARY = "Test programs and examples for mumps"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This packages contains some test and examples programs for mumps. In addition, \
matlab and scilab extensions are provided in /usr/share/doc/packages/mumps."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-ptscotch-openmpi4-examples-5.3.5-7.8.aarch64.rpm"
RPM_HASH = "b04a93d83d2841ef6e498e4eddbfb31a948b32a4830841c3dc4d1edf61e12b7e8e5fdd0ec903d8726c2ef10f5d220dad7d0cfc3e138779cf824781a802241cb7"

RPROVIDES:${PN} += "mumps-examples)( \
mumps-ptscotch-openmpi4-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblacs.so.2.2.2 \
libblas.so.3 \
libc.so.6 \
libcmumps-ptscotch.so.5.3.5 \
libdmumps-ptscotch.so.5.3.5 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.40 \
libmpi-usempi-ignore-tkr.so.40 \
libmpi-usempif08.so.40 \
libmpi.so.40 \
libmumps-common.so.5.3.5 \
libmumps-ptscotch5-3-5-openmpi4 \
libpord-ptscotch.so.5.3.5 \
libptesmumps.so.7.0 \
libptscotch.so.7.0 \
libptscotcherr.so.7.0 \
libscalapack.so.2.2.2 \
libscotch.so.7.0 \
libsmumps-ptscotch.so.5.3.5 \
libzmumps-ptscotch.so.5.3.5"

inherit rpm
