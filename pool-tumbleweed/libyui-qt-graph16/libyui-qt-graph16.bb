SUMMARY = "Libyui - Qt graph widget"
DESCRIPTION = "This package contains the Qt graph component for libyui. \
 \
This is a special widget to visualize graphs such as the \
storage device hierarchy (disks, partitions, subvolumes \
etc.).  and similar graphviz-generated graphs."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.7.7"

RPM_NAME = "libyui-qt-graph16-4.7.7-1.1.aarch64.rpm"
RPM_HASH = "c952cea0d53b6291ba790b19dd51d11c2ffdb6ddcd7a1ddbf1cd31a1e19c820b53b999ac8165752358eb72a80a397d1c67dc22e129942997792c73ccdc116de4"

RPROVIDES:${PN} += "libyui-qt-graph \
libyui-qt-graph.so.16 \
libyui-qt-graph16 \
yast2-qt-graph"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcgraph.so.8 \
libgcc-s.so.1 \
libgvc.so.7 \
libm.so.6 \
libstdc++.so.6 \
libyui-qt16 \
libyui.so.16 \
libyui16"

inherit rpm
