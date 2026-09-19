SUMMARY = "Serial Graph Partitioning and Fill-reducing Matrix Ordering"
DESCRIPTION = "METIS is a family of programs for partitioning unstructured graphs and hypergraph \
and computing fill-reducing orderings of sparse matrices. The underlying algorithms \
used by METIS are based on a multilevel paradigm that, at the time, had been \
shown to produce quality results and scale to large problems."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "metis-5.1.0-13.5.aarch64.rpm"
RPM_HASH = "4eca5f0372aedb58c73ddb3019ce8d63bbf715d95b2a18ad7ad59a585b924d5cfdb75180ef96d6cde9ad36d1a4a8cfff6c07cfce886e1fda59bc6ebd94f3a3c9"

RPROVIDES:${PN} += "metis"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmetis.so.5"

inherit rpm
