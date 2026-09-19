SUMMARY = "Suite of nonlinear solvers - sunmatrix shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunmatrix shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_sunmatrix5-openmpi4-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "16f8db8b548eeadbac8ec2766513c4b7b61246976f896f5de492eb14e111aa0538d8cc31cf36f4f2f01e59f7e2db3d09365d9daa8bff9a5682767aa5bf65c423"

RPROVIDES:${PN} += "libsundials-sunmatrix5-openmpi4 \
libsundials-sunmatrixband.so.5 \
libsundials-sunmatrixdense.so.5 \
libsundials-sunmatrixsparse.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libsundials-core.so.7"

inherit rpm
