SUMMARY = "Suite of nonlinear solvers - sunmatrix shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunmatrix shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_sunmatrix5-openmpi5-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "bbc90c5f6ba176ea2d98ab394ead7b3741f0f9ff14ee73bc55e5c2be511a99ba914e532740221bdf018e15193a8bc2739fc7789c54801341625076c226b5b101"

RPROVIDES:${PN} += "libsundials-sunmatrix5-openmpi5 \
libsundials-sunmatrixband.so.5 \
libsundials-sunmatrixdense.so.5 \
libsundials-sunmatrixsparse.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libsundials-core.so.7"

inherit rpm
