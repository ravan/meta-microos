SUMMARY = "Development headers for SuiteSparse"
DESCRIPTION = "suitesparse is a collection of libraries for computations involving \
sparse matrices. \
 \
The suitesparse-devel package contains files needed for developing \
applications which use the suitesparse libraries."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "7.14.0"

RPM_NAME = "suitesparse-devel-7.14.0-1.1.aarch64.rpm"
RPM_HASH = "355aa5da4a9c9a067730e8bc9022a7ab42852718ebc6a4e23768cf24444e1e14d1bd8c7e9de1d8a2f3667e615757dce255385a3ee408f1d619a4173b2dc6cbd8"

RPROVIDES:${PN} += "cmake-AMD \
cmake-BTF \
cmake-CAMD \
cmake-CCOLAMD \
cmake-CHOLMOD \
cmake-COLAMD \
cmake-CXSparse \
cmake-GraphBLAS \
cmake-KLU \
cmake-KLU-CHOLMOD \
cmake-LAGraph \
cmake-LDL \
cmake-ParU \
cmake-RBio \
cmake-SPEX \
cmake-SPQR \
cmake-SuiteSparse-Mongoose \
cmake-SuiteSparse-config \
cmake-UMFPACK \
pkgconfig-AMD \
pkgconfig-BTF \
pkgconfig-CAMD \
pkgconfig-CCOLAMD \
pkgconfig-CHOLMOD \
pkgconfig-COLAMD \
pkgconfig-CXSparse \
pkgconfig-GraphBLAS \
pkgconfig-KLU \
pkgconfig-KLU-CHOLMOD \
pkgconfig-LAGraph \
pkgconfig-LDL \
pkgconfig-ParU \
pkgconfig-RBio \
pkgconfig-SPEX \
pkgconfig-SPQR \
pkgconfig-SuiteSparse-Mongoose \
pkgconfig-SuiteSparse-config \
pkgconfig-UMFPACK \
suitesparse-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gcc-c++ \
libamd3 \
libbtf2 \
libcamd3 \
libccolamd3 \
libcholmod5 \
libcolamd3 \
libcxsparse4 \
libgraphblas10 \
libklu-cholmod2 \
libklu2 \
liblagraph1 \
liblagraphx1 \
libldl3 \
libparu1 \
librbio4 \
libspex3 \
libspqr4 \
libsuitesparse-mongoose3 \
libsuitesparseconfig7 \
libumfpack6 \
metis-devel \
openblas-devel \
pkgconfig-AMD \
pkgconfig-BTF \
pkgconfig-CHOLMOD \
pkgconfig-COLAMD \
pkgconfig-GraphBLAS \
pkgconfig-KLU \
pkgconfig-SuiteSparse-config \
pkgconfig-UMFPACK \
tbb-devel"

inherit rpm
