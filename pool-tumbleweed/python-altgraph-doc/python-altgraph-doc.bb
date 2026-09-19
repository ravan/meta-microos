SUMMARY = "Documentation for python-altgraph"
DESCRIPTION = "Altgraph is a fork of graphlib: a graph (network) package for constructing \
graphs, BFS and DFS traversals, topological sort, shortest paths, etc. with \
graphviz output."
LICENSE = "MIT"

PV = "0.17.5"

RPM_NAME = "python-altgraph-doc-0.17.5-1.3.noarch.rpm"
RPM_HASH = "5c2c15ff01eb95bddf27352d0598184b23164b00fb9a51f3b0228c05a2ac1bb54e1bcfd64dd999f11004437adda30d37f6633ca90984048609f2f43c545ac6fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-altgraph-doc \
python313-altgraph-doc \
python314-altgraph-doc"

RDEPENDS:${PN} += ""

inherit rpm
