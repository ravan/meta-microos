SUMMARY = "Suite of nonlinear solvers - sunlinsol shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunlinsol shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_sunlinsol5-openmpi4-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "4ad3b40250a95801c09670bfc5dc58e74f212d783976717045b92836834da5fc95fa56f5cd570129b20393f72bd2f434d73e6cd05b3f28f5fec5c929f577a800"

RPROVIDES:${PN} += "libsundials-sunlinsol5-openmpi4 \
libsundials-sunlinsolband.so.5 \
libsundials-sunlinsoldense.so.5 \
libsundials-sunlinsolklu.so.5 \
libsundials-sunlinsollapackband.so.5 \
libsundials-sunlinsollapackdense.so.5 \
libsundials-sunlinsolpcg.so.5 \
libsundials-sunlinsolspbcgs.so.5 \
libsundials-sunlinsolspfgmr.so.5 \
libsundials-sunlinsolspgmr.so.5 \
libsundials-sunlinsolsptfqmr.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libklu.so.2 \
libm.so.6 \
libopenblas.so.0 \
libsundials-core.so.7 \
libsundials-sunmatrix5-openmpi4 \
libsundials-sunmatrixband.so.5 \
libsundials-sunmatrixdense.so.5 \
libsundials-sunmatrixsparse.so.5"

inherit rpm
