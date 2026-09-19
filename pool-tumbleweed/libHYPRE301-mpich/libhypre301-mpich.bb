SUMMARY = "Scalable algorithms for solving linear systems of equations"
DESCRIPTION = "Hypre is a library of preconditioners that feature parallel multigrid \
methods for both structured and unstructured grid problems arising in \
the simulation codes being developed at LLNL to study physical \
phenomena in the defense, environmental, energy, and biological \
sciences. \
 \
This package contains mpich shared libraries of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "3.1.0"

RPM_NAME = "libHYPRE301-mpich-3.1.0-1.2.aarch64.rpm"
RPM_HASH = "4800f2db303a152c0f36c06663d8df7c910d18e62f7f4764e1b64a5b6383bb0d348ea362b7bcae8288a70bb897e7927015cd8b64696937cd756f381920d7f30c"

RPROVIDES:${PN} += "libHYPRE.so.301 \
libHYPRE301-mpich"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
liblapack.so.3 \
libm.so.6 \
libmpi.so.12"

inherit rpm
