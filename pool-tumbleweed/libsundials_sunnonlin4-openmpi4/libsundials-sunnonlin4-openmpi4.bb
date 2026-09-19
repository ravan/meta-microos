SUMMARY = "Suite of nonlinear solvers - sunnonlin shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunnonlin shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_sunnonlin4-openmpi4-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "4dfa105603109840c9ab2fe74bafab4564daaa0857aa649ae8595c6a1f55f33314d288212226db921a12bea1fb876e886a9879b035598261bbd8fe775e625698"

RPROVIDES:${PN} += "libsundials-sunnonlin4-openmpi4 \
libsundials-sunnonlinsolauto.so.4 \
libsundials-sunnonlinsolfixedpoint.so.4 \
libsundials-sunnonlinsolnewton.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsundials-core.so.7"

inherit rpm
