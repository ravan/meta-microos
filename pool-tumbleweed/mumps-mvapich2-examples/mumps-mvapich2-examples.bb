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

RPM_NAME = "mumps-mvapich2-examples-5.3.5-7.7.aarch64.rpm"
RPM_HASH = "2dc2fbdf36500a021795229bb05d6a4d1b41c75e7a8781146cbde72ead14195c3ce26d04258732928a0e1394f4edd229c1a359a6be679ce555308408c1cad101"

RPROVIDES:${PN} += "mumps-examples)( \
mumps-mvapich2-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblacs.so.2.2.2 \
libblas.so.3 \
libc.so.6 \
libcmumps.so.5.3.5 \
libdmumps.so.5.3.5 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi.so.12 \
libmpifort.so.12 \
libmumps-common$.so.5.3.5 \
libmumps5-3-5-mvapich2 \
libpord.so.5.3.5 \
libscalapack.so.2.2.2 \
libsmumps.so.5.3.5 \
libzmumps.so.5.3.5"

inherit rpm
