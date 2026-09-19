SUMMARY = "Sparse Multifrontal LU Factorization"
DESCRIPTION = "UMFPACK is a set of routines for solving unsymmetric sparse linear \
systems, Ax=b, using the Unsymmetric MultiFrontal method. Written in \
ANSI/ISO C, with a MATLAB (Version 6.0 and later) interface. Appears \
as a built-in routine (for lu, backslash, and forward slash) in M \
ATLAB. Includes a MATLAB interface, a C-callable interface, and a \
Fortran-callable interface. Note that 'UMFPACK' is pronounced in two \
syllables, 'Umph Pack'. It is not 'You Em Ef Pack'. \
 \
UMFPACK is part of the SuiteSparse sparse matrix suite."
LICENSE = "GPL-2.0-or-later"

PV = "7.14.0"

RPM_NAME = "libumfpack6-7.14.0-1.1.aarch64.rpm"
RPM_HASH = "178db64f48360f622ef6d2b97013573775c3afe51dd006b2564309b92aeea114ace27f39194ea0ed46dd8e4e3b99e26d4ba30e27a3decbe6cf55e81d40f201ce"

RPROVIDES:${PN} += "libumfpack.so.6 \
libumfpack6"

RDEPENDS:${PN} += "/sbin/ldconfig \
libamd.so.3 \
libc.so.6 \
libcholmod.so.5 \
libm.so.6 \
libopenblas.so.0 \
libsuitesparseconfig.so.7"

inherit rpm
