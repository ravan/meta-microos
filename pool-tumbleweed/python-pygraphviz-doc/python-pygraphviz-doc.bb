SUMMARY = "Python interface to Graphviz"
DESCRIPTION = "A Python wrapper for the Graphviz Agraph data structure. \
PyGraphviz can be used to create and draw networks and graphs with Graphviz."
LICENSE = "BSD-3-Clause"

PV = "1.14"

RPM_NAME = "python-pygraphviz-doc-1.14-3.7.noarch.rpm"
RPM_HASH = "c491905b9ac9e34c736e1bdd89485ef21714a9329b79e7b78f86ea657707b71ebe89832c368e5c620221c1a49df3d8656379bb40b01aa5ca2b157a1ac849ebba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pygraphviz-doc \
python2-pygraphviz-doc"

RDEPENDS:${PN} += "graphviz"

inherit rpm
