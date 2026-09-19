SUMMARY = "Suite of nonlinear solvers - sunnonlin shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunnonlin shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_sunnonlin4-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "812d188a068a5ef3dc9693f9d30effc075e2515bb2903e28ed9bd522ac02149ad7158f6a5f91e97083f78aeecbee958d07dd8d2b77126cb440d6bf3f2f9fea1f"

RPROVIDES:${PN} += "libsundials-sunnonlin4 \
libsundials-sunnonlinsolauto.so.4 \
libsundials-sunnonlinsolfixedpoint.so.4 \
libsundials-sunnonlinsolnewton.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsundials-core.so.7"

inherit rpm
