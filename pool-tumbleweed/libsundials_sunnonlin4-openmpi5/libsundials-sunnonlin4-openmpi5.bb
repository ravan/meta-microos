SUMMARY = "Suite of nonlinear solvers - sunnonlin shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunnonlin shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_sunnonlin4-openmpi5-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "465b4bce91749f9186cc4f14b9cfa79893f29333d5e48c52b787145670d7dac45de0f5eb48f8805680c04adb56c75b583d72ab72b615134484f2df44ab2e1558"

RPROVIDES:${PN} += "libsundials-sunnonlin4-openmpi5 \
libsundials-sunnonlinsolauto.so.4 \
libsundials-sunnonlinsolfixedpoint.so.4 \
libsundials-sunnonlinsolnewton.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsundials-core.so.7"

inherit rpm
