SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides Documentation for mumps. \
 \
 \
 \
 \
This package contains the parallel library with %{mpi_flavor} and ."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-doc-5.3.5-7.6.noarch.rpm"
RPM_HASH = "af6f40c2fa98a550afb0277a0f0d70eb3ef0f3cc4c7300065437ac58ab4819bf4870ff2f2f1a3e1b3e9a90fd1215ea952675747bc084ed878583555295adfa5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-doc"

RDEPENDS:${PN} += ""

inherit rpm
