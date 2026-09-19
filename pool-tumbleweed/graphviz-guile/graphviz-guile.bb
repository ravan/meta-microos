SUMMARY = "Graph Visualization Tools"
DESCRIPTION = "A collection of tools and tcl packages for the manipulation and layout \
of graphs (as in nodes and edges, not as in bar charts)."
LICENSE = "EPL-2.0"

PV = "15.0.0"

RPM_NAME = "graphviz-guile-15.0.0-2.3.aarch64.rpm"
RPM_HASH = "86c7e4cf535f763980b6e8de0ec62d61ee04c83be1ef89fc40fe539b5d9b5af27cf620a29dfe339c303fe14b993fa32734f6b2b09231184e9a965eaef5d5419c"

RPROVIDES:${PN} += "graphviz-guile \
libgv-guile.so"

RDEPENDS:${PN} += "graphviz \
guile \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcgraph.so.8 \
libgcc-s.so.1 \
libguile-3.0.so.1 \
libgvc.so.7 \
libstdc++.so.6"

inherit rpm
