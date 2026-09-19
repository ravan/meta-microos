SUMMARY = "Graphviz dot graph file viewer"
DESCRIPTION = "KGraphViewer is a Graphviz dot graph file viewer, aimed to replace the other \
outdated Graphviz tools. Graphs are commonly used in scientific domains and \
particularly in computer science."
LICENSE = "GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "kgraphviewer-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "d5fb8f2e9073fc9397a2cd3fbfb85ff26681185e5cc860d999bc359086c07f532e82a6b654a11e3f25701e71d290a042f2d18601955807739d02d88dbbbbb32d"

RPROVIDES:${PN} += "kgraphviewer"

RDEPENDS:${PN} += "graphviz \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6Parts.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libkgraphviewer.so.0 \
libstdc++.so.6"

inherit rpm
