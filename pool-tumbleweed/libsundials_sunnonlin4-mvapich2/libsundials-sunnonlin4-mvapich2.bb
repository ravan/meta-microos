SUMMARY = "Suite of nonlinear solvers - sunnonlin shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunnonlin shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_sunnonlin4-mvapich2-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "14360ddfad323cf9677dd45e0cb8cbbecc57cb416d7aefdc6db32c31047c7e6f68de1355f177d0ed21ffb9497c5f5de0d429739c0984e75169676edddc1077c8"

RPROVIDES:${PN} += "libsundials-sunnonlin4-mvapich2 \
libsundials-sunnonlinsolauto.so.4 \
libsundials-sunnonlinsolfixedpoint.so.4 \
libsundials-sunnonlinsolnewton.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.12 \
libsundials-core.so.7"

inherit rpm
