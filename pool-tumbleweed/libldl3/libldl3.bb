SUMMARY = "A Simple LDL^T Factorization"
DESCRIPTION = "LDL is a set of concise routines for factorizing symmetric positive- \
definite sparse matrices, with some applicability to symmetric \
indefinite matrices. Its primary purpose is to illustrate much of the \
basic theory of sparse matrix algorithms in as concise a code as \
possible, including an elegant new method of sparse symmetric \
factorization that computes the factorization row-by-row but stores \
it column-by-column. The entire symbolic and numeric factorization \
consists of a total of only 49 lines of code. The package is written \
in C, and includes a MATLAB interface. \
 \
LDL is part of the SuiteSparse sparse matrix suite."
LICENSE = "LGPL-2.1-or-later"

PV = "7.14.0"

RPM_NAME = "libldl3-7.14.0-1.1.aarch64.rpm"
RPM_HASH = "1adf79024cfd7cdaac7590a0569995ffc9064b33952f6275263dd1e691868b83b5b56a91741013f2551322943dfcce97a0f086952f75cd792ec9d05a22bde903"

RPROVIDES:${PN} += "libldl.so.3 \
libldl3"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
