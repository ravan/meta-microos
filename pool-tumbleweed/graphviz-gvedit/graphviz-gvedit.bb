SUMMARY = "Graph editor based on Qt"
DESCRIPTION = "The Qt6 graph editor included with graphviz."
LICENSE = "EPL-2.0"

PV = "15.0.0"

RPM_NAME = "graphviz-gvedit-15.0.0-2.2.aarch64.rpm"
RPM_HASH = "2c39dc86a684431d8d13060e2f8c97b4a87a32bf952a27a58d7e1661c24ca9842c82c02f4059bc9796a4d2f3597d9d6e1ed44834ff042ba562c2675af21de585"

RPROVIDES:${PN} += "graphviz-gvedit"

RDEPENDS:${PN} += "graphviz \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcgraph.so.8 \
libgcc-s.so.1 \
libgvc.so.7 \
libstdc++.so.6"

inherit rpm
