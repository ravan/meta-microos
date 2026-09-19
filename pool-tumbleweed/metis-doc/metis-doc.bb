SUMMARY = "Metis documentation"
DESCRIPTION = "METIS is a family of programs for partitioning unstructured graphs and hypergraph \
and computing fill-reducing orderings of sparse matrices. The underlying algorithms \
used by METIS are based on a multilevel paradigm that, at the time, had been \
shown to produce quality results and scale to large problems."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "metis-doc-5.1.0-13.5.noarch.rpm"
RPM_HASH = "e6d078def21844bd3c44b57647682e8cc52f5f0f4801e1a7a6073c5947c03ff57d0a8e6623c6e6cac6e43507cd1994a7a0b1743aa920a68a1090e737d3add133"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metis-doc"

RDEPENDS:${PN} += ""

inherit rpm
