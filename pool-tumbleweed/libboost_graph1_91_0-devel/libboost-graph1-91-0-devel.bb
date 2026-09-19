SUMMARY = "Development headers for Boost.Graph library"
DESCRIPTION = "Development headers for Boost.Graph library. The BGL algorithms consist \
of a core set of algorithm patterns and a larger set of graph \
algorithms. The core algorithm patterns are Breadth First Search, Depth \
First Search, and Uniform Cost Search."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_graph1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "4397b593e1a3b47780963f81a612c149b8f6580dc98ae7fb3ba74f06c84356875a24867735cfabb658123f2367e4ce525cd53aeb8d99192452dae5bc6875a6ea"

RPROVIDES:${PN} += "libboost-graph-devel-impl \
libboost-graph1-91-0-devel"

RDEPENDS:${PN} += "libboost-graph1-91-0 \
libboost-headers1-91-0-devel \
libboost-regex1-91-0-devel \
libstdc++-devel"

inherit rpm
