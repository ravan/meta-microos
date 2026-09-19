SUMMARY = "Suite of nonlinear solvers - sunlinsol shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunlinsol shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "libsundials_sunlinsol5-mvapich2-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "a1f3d9b2d9d42f46cacb5d852be22e04d05b9a43f503686b3fbccdbad8c55ad12cd8d29a1a50df618d946772ac0430639a856e5025fe313f0ef17ae1f13540f2"

RPROVIDES:${PN} += "libsundials-sunlinsol5-mvapich2 \
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
libmpi.so.12 \
libopenblas.so.0 \
libsundials-core.so.7 \
libsundials-sunmatrix5-mvapich2 \
libsundials-sunmatrixband.so.5 \
libsundials-sunmatrixdense.so.5 \
libsundials-sunmatrixsparse.so.5"

inherit rpm
