SUMMARY = "SPEX, A SParse EXact Algebra Factorizations"
DESCRIPTION = "SPEX is software package used to solve a sparse systems of linear equations \
and replaces SLIP LU. \
 \
SPEX Util is a software package containing utility and auxiliary functions for the \
SPEX factorizations. Additionally, SPEX Util provides a wrapper class for the GNU \
Multiple Precision Arithmetic (GMP) and GNU Multiple Precision Floating Point \
Reliable (MPFR) libraries that prevent memory leaks and improve the overall \
stability of these external libraries. SPEX Util is written in ANSI C. \
 \
SPEX operates on matrices stored in any of the following 15 combinations of matrix formats and entry data-types \
 \
SPEX and SPEX Utils are part of the SuiteSparse sparse matrix suite."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "7.14.0"

RPM_NAME = "libspex3-7.14.0-1.1.aarch64.rpm"
RPM_HASH = "ee2718c115ed2d403ba06594510eb1a72ded38f8f5f1a1f5e278f32f05655d3859103eb7aab731e15c42cbc9f27d54465e148044f9b8d35d755f20e753869f6f"

RPROVIDES:${PN} += "libspex.so.3 \
libspex3 \
libspexpython.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
libamd.so.3 \
libc.so.6 \
libcolamd.so.3 \
libgmp.so.10 \
libm.so.6 \
libmpfr.so.6 \
libsuitesparseconfig.so.7"

inherit rpm
