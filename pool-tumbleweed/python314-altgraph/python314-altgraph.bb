SUMMARY = "Python graph (network) package"
DESCRIPTION = "Altgraph is a fork of graphlib: a graph (network) package for constructing \
graphs, BFS and DFS traversals, topological sort, shortest paths, etc. with \
graphviz output."
LICENSE = "MIT"

PV = "0.17.5"

RPM_NAME = "python314-altgraph-0.17.5-1.3.noarch.rpm"
RPM_HASH = "22039510b3a8c8020be5112042cde660d71c20780c40954d4b28e2ae0b5d3c8a6f0378686b0ea2ffa1aad20b2df3c892838ead6ad9ed330b462216aa735a1b53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-altgraph \
python314-altgraph \
python3dist-altgraph"

RDEPENDS:${PN} += "python-abi"

inherit rpm
