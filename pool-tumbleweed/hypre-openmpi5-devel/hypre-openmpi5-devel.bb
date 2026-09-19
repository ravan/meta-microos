SUMMARY = "Headers and library links for libHYPRE301-openmpi5"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the openmpi5 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "3.1.0"

RPM_NAME = "hypre-openmpi5-devel-3.1.0-1.2.aarch64.rpm"
RPM_HASH = "c96f58ff854e93027469223044d6c549ea8ea772aaf074a506f9a423283f42f99eb56199ea6c384d28e251d35f399beb973239fccb2fc1dd523baf16e2d331ac"

RPROVIDES:${PN} += "hypre-openmpi5-devel"

RDEPENDS:${PN} += "lapack-devel \
libHYPRE301-openmpi5 \
superlu-devel"

inherit rpm
