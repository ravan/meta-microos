SUMMARY = "Python graph (network) package"
DESCRIPTION = "Altgraph is a fork of graphlib: a graph (network) package for constructing \
graphs, BFS and DFS traversals, topological sort, shortest paths, etc. with \
graphviz output."
LICENSE = "MIT"

PV = "0.17.5"

RPM_NAME = "python313-altgraph-0.17.5-1.3.noarch.rpm"
RPM_HASH = "79d74e54f89fa16a50e570dc82863d5c42b9dc371f8fc3606b746e04fac262896a61f6911406e9a808eaac5605f7647d8fa601dee91a18d6349f7a613dda709e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-altgraph \
python3.13dist-altgraph \
python313-altgraph \
python3dist-altgraph"

RDEPENDS:${PN} += "python-abi"

inherit rpm
