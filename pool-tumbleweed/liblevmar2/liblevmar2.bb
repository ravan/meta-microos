SUMMARY = "Levenberg-Marquardt nonlinear least squares algorithm"
DESCRIPTION = "levmar is a native ANSI C implementation of the Levenberg-Marquardt \
optimization algorithm.  Both unconstrained and constrained (under linear \
equations, inequality and box constraints) Levenberg-Marquardt variants are \
included.  The LM algorithm is an iterative technique that finds a local \
minimum of a function that is expressed as the sum of squares of nonlinear \
functions.  It has become a standard technique for nonlinear least-squares \
problems and can be thought of as a combination of steepest descent and the \
Gauss-Newton method.  When the current solution is far from the correct on, \
the algorithm behaves like a steepest descent method: slow, but guaranteed \
to converge.  When the current solution is close to the correct solution, it \
becomes a Gauss-Newton method"
LICENSE = "GPL-2.0-or-later"

PV = "2.6"

RPM_NAME = "liblevmar2-2.6-2.15.aarch64.rpm"
RPM_HASH = "ba97767dec37129a7ca26d184b9cb26305253ca049cd865b19d250dcea7c58b95ab3cf9b55f351d97f52a15eef13e69c3cec2a390e17f10a96edaec22f875996"

RPROVIDES:${PN} += "liblevmar.so.2 \
liblevmar2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
liblapack.so.3 \
libm.so.6"

inherit rpm
