SUMMARY = "Community effort collection of algorithms on top of GraphBLAS"
DESCRIPTION = "This package provides a collection of graph algorithms built on top of GraphBLAS. \
 \
LAGraph is part of the SuiteSparse sparse matrix suite."
LICENSE = "GPL-2.0-or-later"

PV = "7.14.0"

RPM_NAME = "liblagraph1-7.14.0-1.1.aarch64.rpm"
RPM_HASH = "30ea99c892cb5779ed2de96fb1a20a0d51cf45f9d47aaddea1a1ec0c1c58c941827a95f48e2064a8ef776f2a34deb17796afb32102a1b0b5621df3ddfdc36020"

RPROVIDES:${PN} += "liblagraph.so.1 \
liblagraph1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgomp.so.1 \
libgraphblas.so.10 \
libm.so.6"

inherit rpm
