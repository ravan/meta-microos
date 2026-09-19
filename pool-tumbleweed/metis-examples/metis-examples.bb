SUMMARY = "Metis examples"
DESCRIPTION = "METIS library provides to partitioning unstructured graphs and hypergraph \
and computing fill-reducing orderings of sparse matrices. This package provides \
graph files you can use to test Metis."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "metis-examples-5.1.0-13.5.noarch.rpm"
RPM_HASH = "c9d9b830a252b899b4d6b284036d2799a72c74ff476edf224371ebf07f7769c45ae225541c746f41813b42656e2cb02e962dd01b8f31a62c5e4a37604f228254"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metis-examples"

RDEPENDS:${PN} += ""

inherit rpm
