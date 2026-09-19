SUMMARY = "Python interface for Graphviz"
DESCRIPTION = "This package facilitates the creation and rendering of graph descriptions in \
the DOT language of the Graphviz graph drawing software from Python. \
 \
It supports creating a graph object, assembling the graph by adding nodes and \
edges, and retrieving its DOT source code string, saving the source code to a \
file and rendering it with the Graphviz installation. \
 \
Using the view option/method, the resulting (PDF, PNG, SVG, etc.) file can be \
inspected with its default application. Graphs can also be rendered and \
displayed within IPython notebooks."
LICENSE = "MIT"

PV = "0.21"

RPM_NAME = "python313-graphviz-0.21-2.4.noarch.rpm"
RPM_HASH = "330074e4c19767ce4f6ee903343315f854dfa96df7674d3340ef823f6faf8bda8dac41b6b60ecdacfb73555cb184f7170b941eeda70735884ada22c1bf1f67bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-graphviz \
python3.13dist-graphviz \
python313-graphviz \
python3dist-graphviz"

RDEPENDS:${PN} += "graphviz \
python-abi"

inherit rpm
