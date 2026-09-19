SUMMARY = "Headers and library links for libHYPRE301-mvapich2"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the mvapich2 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "3.1.0"

RPM_NAME = "hypre-mvapich2-devel-3.1.0-1.2.aarch64.rpm"
RPM_HASH = "57212d72583b8b8d6d362afb38b215f1816a755fc30585d4d5656f08066b16da56bb326833c6408ef670141287caede6ebc0781fd261e811a19a9ca9e59d086a"

RPROVIDES:${PN} += "hypre-mvapich2-devel"

RDEPENDS:${PN} += "lapack-devel \
libHYPRE301-mvapich2 \
superlu-devel"

inherit rpm
