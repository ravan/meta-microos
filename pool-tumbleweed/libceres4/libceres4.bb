SUMMARY = "Ceres Solver shared library"
DESCRIPTION = "Ceres Solver is a C++ library for modeling and solving large, \
complicated optimization problems. It can be used to solve Non-linear Least \
Squares problems with bounds constraints and general unconstrained optimization \
problems. \
 \
This package is built with Eigen only."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "libceres4-2.2.0-3.3.aarch64.rpm"
RPM_HASH = "10cb26e96132dac3210f2a9952a7765039064d22fe810f59f5743fc95fba5c38a61316a9ef63ba39e15031fc7de6803aaff632fa5a7e4d31243d56c7a0817c3c"

RPROVIDES:${PN} += "libceres.so.4 \
libceres4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcholmod.so.5 \
libgcc-s.so.1 \
libglog.so.2 \
libm.so.6 \
libopenblas.so.0 \
libspqr.so.4 \
libstdc++.so.6"

inherit rpm
