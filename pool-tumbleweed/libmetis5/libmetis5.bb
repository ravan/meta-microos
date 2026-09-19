SUMMARY = "Serial Graph Partitioning and Fill-reducing Matrix Ordering library"
DESCRIPTION = "METIS library provides to partitioning unstructured graphs and hypergraph \
and computing fill-reducing orderings of sparse matrices. The underlying algorithms \
used by METIS are based on a multilevel paradigm that, at the time, had been \
shown to produce quality results and scale to large problems."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "libmetis5-5.1.0-13.5.aarch64.rpm"
RPM_HASH = "a53cd15fe0da2df73ad6167544d42791054a8daf991aa4d9998851fa881bd73d87c87334fd0da04e63488257a676e28e2bb1c33cc5fee5d2da5614b7a59c4813"

RPROVIDES:${PN} += "libmetis.so.5 \
libmetis5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libm.so.6"

inherit rpm
