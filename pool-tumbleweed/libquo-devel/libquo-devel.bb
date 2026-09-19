SUMMARY = "Development headers and libraries for libquo"
DESCRIPTION = "QUO is an API tailored for MPI/MPI+X codes that may benefit from \
evolving process binding policies during their execution. QUO allows \
for arbitrary process binding policies to be enacted and reverted \
during the execution as different computational phases are entered \
and exited, respectively. \
 \
This package contains development headers and libraries for libquo."
LICENSE = "BSD-3-Clause"

PV = "1.4.1"

RPM_NAME = "libquo-devel-1.4.1-1.1.aarch64.rpm"
RPM_HASH = "ce5697d5a8dba08b6ae2148c9010d106c15c0d9299e0d8be08d2318a685742f242d8ec28b7610ff07c04dd242e28eda8d5e0c911848ba8526a9e4c523dec4bcf"

RPROVIDES:${PN} += "libquo-devel \
pkgconfig-libquo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libquo8"

inherit rpm
