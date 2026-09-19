SUMMARY = "Suite of nonlinear solvers - sunmatrix shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunmatrix shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_sunmatrix5-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "70798422244496917c600c76296ac8a9ffa188672c750ad4e79ee8ac7b71e05b9b889a51062ce2870c652e5006f32a4b8260a45aff355d9b61d66e786db0e821"

RPROVIDES:${PN} += "libsundials-sunmatrix5 \
libsundials-sunmatrixband.so.5 \
libsundials-sunmatrixdense.so.5 \
libsundials-sunmatrixsparse.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libsundials-core.so.7"

inherit rpm
