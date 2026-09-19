SUMMARY = "Scalable algorithms for solving linear systems of equations"
DESCRIPTION = "Hypre is a library of preconditioners that feature parallel multigrid \
methods for both structured and unstructured grid problems arising in \
the simulation codes being developed at LLNL to study physical \
phenomena in the defense, environmental, energy, and biological \
sciences. \
 \
This package contains mvapich2 shared libraries of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "3.1.0"

RPM_NAME = "libHYPRE301-mvapich2-3.1.0-1.2.aarch64.rpm"
RPM_HASH = "f6e0d15adf218ff0326673ca13426cb631f375a294dd0b7932d9b64adc1d450ca7832511100ee47ec1deddf589bbcf814d48c21404f75b185ab30713c8330a99"

RPROVIDES:${PN} += "libHYPRE.so.301 \
libHYPRE301-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
liblapack.so.3 \
libm.so.6 \
libmpi.so.12"

inherit rpm
