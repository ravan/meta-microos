SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the serial libraries from the MPI library \
directory MUMPS built for mvapich2."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps5_3_5-mvapich2-compat-5.3.5-7.7.aarch64.rpm"
RPM_HASH = "ffabe1da2c4dd11ab32b29c36f3de8d63a42f09822de2257748b46d992e553497b0b3db9fdc1ada1ebba5dabf6a07895c39cebbba838562e3f6f7fbf635c814d"

RPROVIDES:${PN} += "libmumps5-3-5-mvapich2-compat"

RDEPENDS:${PN} += "libmumps5-3-5"

inherit rpm
