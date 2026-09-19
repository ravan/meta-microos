SUMMARY = "Metis development files"
DESCRIPTION = "METIS library provides to partitioning unstructured graphs and hypergraph \
and computing fill-reducing orderings of sparse matrices. The underlying algorithms \
used by METIS are based on a multilevel paradigm that, at the time, had been \
shown to produce quality results and scale to large problems. \
 \
This package provides development files."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "metis-devel-5.1.0-13.5.aarch64.rpm"
RPM_HASH = "ffee835d13bdb6350a119a20ab8a6cb3007e205c58d09a7de0018c0dd53dd771d699f2838ad6810b5801b891c8f627e56243ad2134750ab694067640b8b04ffb"

RPROVIDES:${PN} += "metis-devel"

RDEPENDS:${PN} += "libmetis5"

inherit rpm
