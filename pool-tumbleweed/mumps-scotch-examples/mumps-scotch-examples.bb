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

RPM_NAME = "mumps-scotch-examples-5.3.5-7.7.aarch64.rpm"
RPM_HASH = "181236f120b7ea728299f5cf7e5f32a5e66f8c1b334136e2f5aa7107584db2c890b70fbb2a64dae99ad214ec7e47d53ff137cb2e4061acd1277f63721c04384e"

RPROVIDES:${PN} += "mumps-examples)( \
mumps-scotch-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libcmumps-scotch.so.5.3.5 \
libdmumps-scotch.so.5.3.5 \
libesmumps.so.7.0 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpiseq-scotch.so.5.3.5 \
libmumps-common.so.5.3.5 \
libmumps-scotch5-3-5 \
libpord-scotch.so.5.3.5 \
libscotch.so.7.0 \
libscotcherr.so.7.0 \
libsmumps-scotch.so.5.3.5 \
libzmumps-scotch.so.5.3.5"

inherit rpm
