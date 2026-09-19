SUMMARY = "Graphviz plugin for renderers based on gd"
DESCRIPTION = "The graphviz-gd package contains the gd extensions for the graphviz \
tools."
LICENSE = "EPL-2.0"

PV = "15.0.0"

RPM_NAME = "graphviz-gd-15.0.0-2.3.aarch64.rpm"
RPM_HASH = "05fd34f5931f0d97d69f5ee732d339b08eba196742d8d5b94192a2aca20a89b289634302428007880b3111d646abbb7b8c8968f0ad01cf6a3f8929d4b181e1e7"

RPROVIDES:${PN} += "graphviz-gd \
libgvplugin-gd.so.8"

RDEPENDS:${PN} += "/usr/bin/sh \
graphviz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcgraph.so.8 \
libgd.so.3 \
libgvc.so.7 \
libm.so.6"

inherit rpm
