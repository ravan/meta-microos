SUMMARY = "Development headers for Boost.Graph library"
DESCRIPTION = "Development headers for Boost.Graph library. The BGL algorithms consist \
of a core set of algorithm patterns and a larger set of graph \
algorithms. The core algorithm patterns are Breadth First Search, Depth \
First Search, and Uniform Cost Search. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_graph-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "53ee31da79df3983ec5d926fc62468664078ab9e43cd003dfa6485587a73d1c7d201124205fad0e5e866901199205fc28c6866adade7d7f500a84e247f4ed53c"

RPROVIDES:${PN} += "libboost-graph-devel"

RDEPENDS:${PN} += "libboost-graph1-91-0-devel"

inherit rpm
