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

RPM_NAME = "mumps-examples-5.3.5-7.6.aarch64.rpm"
RPM_HASH = "43818a9fd9ef35cb63d3b2e2f19c396890024297491e45f7c224464127818751ba1cd599dc8d40228eef7f8b657551c25b6df602be40f152eb62be037985deb5"

RPROVIDES:${PN} += "mumps-examples \
mumps-examples)("

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libcmumps-seq.so.5.3.5 \
libdmumps-seq.so.5.3.5 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpiseq-seq.so.5.3.5 \
libmumps-common.so.5.3.5 \
libmumps5-3-5 \
libpord-seq.so.5.3.5 \
libsmumps-seq.so.5.3.5 \
libzmumps-seq.so.5.3.5"

inherit rpm
