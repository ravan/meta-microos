SUMMARY = "GNU Scientific Library"
DESCRIPTION = "The GNU Scientific Library (GSL) is a collection of routines for \
numerical computing. The routines are written from scratch by the GSL \
team in ANSI C and present an Applications Programming Interface \
(API) for C programmers, while allowing wrappers to be written for very \
high level languages. \
 \
The library covers the following areas: \
 \
Complex Numbers - Roots of Polynomials - Special Functions - \
Vectors and Matrices - Permutations - Sorting - BLAS Support - \
Linear Algebra - Eigensystems - Fast Fourier Transforms - Quadrature - \
Random Numbers - Quasi-Random Sequences - Random Distributions - \
Statistics - Histograms - N-Tuples - Monte Carlo Integration - \
Simulated Annealing - Differential Equations - Interpolation - \
Numerical Differentiation - Chebyshev Approximation - Series Acceleration - \
Discrete Hankel Transforms - Root-Finding - Minimization - \
Least-Squares Fitting - Physical Constants - IEEE Floating-Point"
LICENSE = "GPL-3.0-or-later"

PV = "2.8"

RPM_NAME = "libgsl28-2.8-5.3.aarch64.rpm"
RPM_HASH = "b6b5e27cadca9410142237900ea2533ddc974c5fd62d6ced6932ac6357bc0d8dcbbdf973c74c267833728a4ff1e532edbbaae887ba8e56cab1e2822f550d8c14"

RPROVIDES:${PN} += "libgsl.so.28 \
libgsl28"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
