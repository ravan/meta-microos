SUMMARY = "Suite of nonlinear solvers - idas shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' idas solver."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_idas6-openmpi4-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "1d952f1fa178bd8ab7a729636c805a1415c2fe7316b6dc6e3832e41add1027445ed7f4f33ca3fbb5587094e422ef6f49aeae95c0391a6563f7d522d86221ae79"

RPROVIDES:${PN} += "libsundials-idas.so.6 \
libsundials-idas6-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsundials-core.so.7"

inherit rpm
