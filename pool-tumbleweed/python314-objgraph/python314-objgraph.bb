SUMMARY = "Python module to draw object reference graphs with graphviz"
DESCRIPTION = "objgraph is a module for visual exploration of Python object graphs. \
 \
graphviz is needed if pretty graphs are desired. \
xdot can be used for interactive use."
LICENSE = "MIT"

PV = "3.6.2"

RPM_NAME = "python314-objgraph-3.6.2-1.5.noarch.rpm"
RPM_HASH = "10dd5d4930ea8801344eb84fe1c224c23e96e55ad64bfbb63a0c75a49cf3bbeb059b9db63df520b370ff7bcd417c13850ce72b0bca85700d6b6b166c4dbbfa73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-objgraph \
python314-objgraph \
python3dist-objgraph"

RDEPENDS:${PN} += "graphviz-gd \
graphviz-gnome \
python-abi \
python314-graphviz"

inherit rpm
