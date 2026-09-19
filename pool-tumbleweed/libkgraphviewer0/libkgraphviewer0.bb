SUMMARY = "Graphviz dot graph file viewer"
DESCRIPTION = "KGraphViewer is a Graphviz dot graph file viewer, aimed to replace the other \
outdated Graphviz tools. Graphs are commonly used in scientific domains and \
particularly in computer science. \
 \
This package install the kgraphviewer library."
LICENSE = "GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "libkgraphviewer0-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "4c0f19bcf0c94242a1f6b8332192ece48aade37dbf42fc2c41ee0494cb82cf97806be202806ed03adde761dc0174b0a528f40e86825a00629d79c8791aa56633"

RPROVIDES:${PN} += "libkgraphviewer.so.0 \
libkgraphviewer0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6I18n.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcgraph.so.8 \
libgvc.so.7 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
