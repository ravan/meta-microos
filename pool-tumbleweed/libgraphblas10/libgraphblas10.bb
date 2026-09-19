SUMMARY = "An implementation of the GraphBLAS standard"
DESCRIPTION = "GraphBLAS is an full implementation of the GraphBLAS standard, \
which defines a set of sparse matrix operations on an extended algebra of \
semirings using an almost unlimited variety of operators and types.  When \
applied to sparse adjacency matrices, these algebraic operations are equivalent \
to computations on graphs.  GraphBLAS provides a powerful and expressive \
framework for creating graph algorithms based on the elegant mathematics of \
sparse matrix operations on a semiring. \
 \
GraphBLAS is part of the SuiteSparse sparse matrix suite."
LICENSE = "Apache-2.0"

PV = "7.14.0"

RPM_NAME = "libgraphblas10-7.14.0-1.1.aarch64.rpm"
RPM_HASH = "5ba5831ae1c821babe867ee09649495b2926e3f71fa66b0ed796b371764d011daf4f9a2438c5ffa548ec0b4497d92a1bd99c376b3b1a872a98da68d04cfa337a"

RPROVIDES:${PN} += "libgraphblas.so.10 \
libgraphblas10"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgomp.so.1 \
libm.so.6"

inherit rpm
