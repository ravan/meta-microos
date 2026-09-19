SUMMARY = "Scalable algorithms for solving linear systems of equations"
DESCRIPTION = "Hypre is a library of preconditioners that feature parallel multigrid \
methods for both structured and unstructured grid problems arising in \
the simulation codes being developed at LLNL to study physical \
phenomena in the defense, environmental, energy, and biological \
sciences. \
 \
This package contains openmpi5 shared libraries of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "3.1.0"

RPM_NAME = "libHYPRE301-openmpi5-3.1.0-1.2.aarch64.rpm"
RPM_HASH = "08bed3c7999c72c0cc690003a85a59284d463aabe8f1c8be4dc34c96d65232346f0eff1f4aaff0fa16713191dbca288f4938ceb7311c067b1bffff6874884e09"

RPROVIDES:${PN} += "libHYPRE.so.301 \
libHYPRE301-openmpi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
liblapack.so.3 \
libm.so.6 \
libmpi.so.40"

inherit rpm
