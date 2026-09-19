SUMMARY = "Graph Visualization Tools"
DESCRIPTION = "A collection of tools and tcl packages for the manipulation and layout \
of graphs (as in nodes and edges, not as in bar charts)."
LICENSE = "EPL-2.0"

PV = "15.0.0"

RPM_NAME = "graphviz-15.0.0-2.2.aarch64.rpm"
RPM_HASH = "ace0c77e97c66d1a1ea780c565db143d461427e231cd6f9193e1cb8fcd6728588d19ca2d3cff6266c34cd1b593ff01273b53a5e45f48bb280a842658c627b845"

RPROVIDES:${PN} += "graphviz"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
bitstream-vera-fonts \
graphviz-plugins-core \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdt.so.6 \
libcgraph.so.8 \
libexpat.so.1 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgts-0.7.so.5 \
libgvc.so.7 \
libgvplugin-core.so.8 \
libgvplugin-dot-layout.so.8 \
libgvplugin-neato-layout.so.8 \
libgvplugin-vt.so.8 \
libgvpr.so.2 \
libm.so.6 \
libmvec.so.1 \
libpathplan.so.4 \
libstdc++.so.6 \
libxdot.so.4"

inherit rpm
