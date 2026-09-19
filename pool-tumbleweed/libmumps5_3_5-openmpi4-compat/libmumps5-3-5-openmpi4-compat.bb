SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the serial libraries from the MPI library \
directory MUMPS built for openmpi4."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps5_3_5-openmpi4-compat-5.3.5-7.7.aarch64.rpm"
RPM_HASH = "273461502dec63db7818775de01471f7dfb2ee8998e8ba6bc3c866d1bfbfc512330b2debbd2c900f3d6be2fa4e1e30c2073ad6f081804837d8557d1d178bfa0d"

RPROVIDES:${PN} += "libmumps5-3-5-openmpi4-compat"

RDEPENDS:${PN} += "libmumps5-3-5"

inherit rpm
