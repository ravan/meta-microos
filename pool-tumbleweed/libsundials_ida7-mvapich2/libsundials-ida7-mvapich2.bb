SUMMARY = "Suite of nonlinear solvers - ida shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' ida solver."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_ida7-mvapich2-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "247b18f0e16a174197d34a4b01724bc0144f206370f91af498340012221cdae52abf9aa3ac1a6f4380cb842d7a5c4b77a3abb9354e058b646f409c4a13f9e26f"

RPROVIDES:${PN} += "libsundials-ida.so.7 \
libsundials-ida7-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.12 \
libsundials-core.so.7"

inherit rpm
