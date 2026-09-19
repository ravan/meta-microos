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

RPM_NAME = "python314-graphviz-0.21-2.4.noarch.rpm"
RPM_HASH = "10832eab51848327f9ae58d149de5bb3195511f2ef22e5f897e70a1b1d72d54773fa3982ec386720b56182deedb18c4f76668949f11dfe58be7ff71431435dd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-graphviz \
python314-graphviz \
python3dist-graphviz"

RDEPENDS:${PN} += "graphviz \
python-abi"

inherit rpm
