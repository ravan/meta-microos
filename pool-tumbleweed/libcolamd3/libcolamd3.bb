SUMMARY = "Column Approximate Minimum Degree"
DESCRIPTION = "The COLAMD column approximate minimum degree ordering algorithm \
computes a permutation vector P such that the LU factorization of \
A (:,P) tends to be sparser than that of A. The Cholesky \
factorization of (A (:,P))'*(A (:,P)) will also tend to be sparser \
than that of A'*A. SYMAMD is a symmetric minimum degree ordering \
method based on COLAMD, available as a MATLAB-callable function. It \
constructs a matrix M such that M'*M has the same pattern as A, and \
then uses COLAMD to compute a column ordering of M. Colamd and symamd \
tend to be faster and generate better orderings than their MATLAB \
counterparts, colmmd and symmmd. \
 \
COLAMD is part of the SuiteSparse sparse matrix suite."
LICENSE = "BSD-3-Clause"

PV = "7.14.0"

RPM_NAME = "libcolamd3-7.14.0-1.1.aarch64.rpm"
RPM_HASH = "f1bcdb856e014a576c36cf16dab0c876a54526fa6605b9fcf764fd9918da990140ac428162bdee2250f253128d03e707f457b68ca14fe021cc2ca9b586dc50ff"

RPROVIDES:${PN} += "libcolamd.so.3 \
libcolamd3"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libm.so.6 \
libsuitesparseconfig.so.7"

inherit rpm
