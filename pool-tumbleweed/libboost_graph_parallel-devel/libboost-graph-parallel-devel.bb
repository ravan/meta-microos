SUMMARY = "Development headers for Boost.Graph parallel library"
DESCRIPTION = "Development headers for Boost.Graph parallel boost library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_graph_parallel-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "5aabbbc5f4e67d56fb96ac7beb73cf95062976f5ceeba54247945c78ae5feb37a449de99af5fcad493cb94d4d85ffe2fdcb1bb72b92f4a40ff9c9371b79e89f1"

RPROVIDES:${PN} += "libboost-graph-parallel-devel"

RDEPENDS:${PN} += "libboost-graph-parallel1-91-0-devel"

inherit rpm
