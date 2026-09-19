SUMMARY = "Python module to draw object reference graphs with graphviz"
DESCRIPTION = "objgraph is a module for visual exploration of Python object graphs. \
 \
graphviz is needed if pretty graphs are desired. \
xdot can be used for interactive use."
LICENSE = "MIT"

PV = "3.6.2"

RPM_NAME = "python313-objgraph-3.6.2-1.5.noarch.rpm"
RPM_HASH = "223ef04bf2848fc4c1636bc7e18adeb9b6c48d2b8c2d09b30689b0d61d3584c64b589f2d4f25525a5e86fecaea8003abed86b373c15c39075e60d75a3e6c5ff2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-objgraph \
python3.13dist-objgraph \
python313-objgraph \
python3dist-objgraph"

RDEPENDS:${PN} += "graphviz-gd \
graphviz-gnome \
python-abi \
python313-graphviz"

inherit rpm
