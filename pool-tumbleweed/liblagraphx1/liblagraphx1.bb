SUMMARY = "Community effort collection of algorithms on top of GraphBLAS"
DESCRIPTION = "This package provides an extended collection of graph algorithms built on top of GraphBLAS. \
 \
LAGraphX is part of the SuiteSparse sparse matrix suite."
LICENSE = "GPL-2.0-or-later"

PV = "7.14.0"

RPM_NAME = "liblagraphx1-7.14.0-1.1.aarch64.rpm"
RPM_HASH = "a542a6ebdb1547ea144545dde31013f42f92e521642c9de4345158b67cc77e1d08e115c025d90e0116fcf9ac7aebc16b2a5ec96aecac31e3255fcc8338b09c31"

RPROVIDES:${PN} += "liblagraphx.so.1 \
liblagraphx1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgomp.so.1 \
libgraphblas.so.10 \
liblagraph.so.1 \
libm.so.6"

inherit rpm
