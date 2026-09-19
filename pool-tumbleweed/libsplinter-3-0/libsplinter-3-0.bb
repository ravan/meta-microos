SUMMARY = "A library for multivariate function approximation implemented in C++"
DESCRIPTION = "SPLINTER (SPLine INTERpolation) is a library for multivariate function \
approximation implemented in C++. The library can be used for function \
approximation, regression and data smoothing. Currently, \
the library contains the following implementations: \
 \
1. tensor product B-splines, \
2. radial basis functions, including the thin plate spline, and \
3. polynomial regression. \
 \
The coefficients in these models are computed using ordinary least \
squares (OLS). The name of the library, SPLINTER, originates from the \
tensor product B-spline implementation, which was the first of the \
methods to be implemented."
LICENSE = "MPL-2.0"

PV = "3.0"

RPM_NAME = "libsplinter-3-0-3.0-4.5.aarch64.rpm"
RPM_HASH = "26b9d060b703d3d39b77b69374a0e353cb919f9eb8286d4a75197a2b3d22e36d7c029f9ad27fcb8359510ebb52e1a652d33416b9d45d0f8e082589e784180f11"

RPROVIDES:${PN} += "libsplinter-3-0 \
libsplinter-3-0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
