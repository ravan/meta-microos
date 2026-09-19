SUMMARY = "Core plugins for graphviz"
DESCRIPTION = "Core plugins for graphviz: \
 * libgvplugin_core \
 * libgvplugin_dot_layout \
 * libgvplugin_neato_layout"
LICENSE = "EPL-2.0"

PV = "15.0.0"

RPM_NAME = "graphviz-plugins-core-15.0.0-2.2.aarch64.rpm"
RPM_HASH = "9e09af1e52636d9962580148bf3f609c6f14d432bc14583c1bd5364433aced0c1e79417f57ef248d8e0416b0538029391e00661ce9c4da8c77c82b66f24ce4f0"

RPROVIDES:${PN} += "graphviz-plugins-core \
libgvplugin-core.so.8 \
libgvplugin-dot-layout.so.8 \
libgvplugin-kitty.so.8 \
libgvplugin-neato-layout.so.8 \
libgvplugin-vt.so.8"

RDEPENDS:${PN} += "/usr/bin/sh \
graphviz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdt.so.6 \
libcgraph.so.8 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgts-0.7.so.5 \
libgvc.so.7 \
libm.so.6 \
libpathplan.so.4 \
libstdc++.so.6 \
libxdot.so.4 \
libz.so.1"

inherit rpm
