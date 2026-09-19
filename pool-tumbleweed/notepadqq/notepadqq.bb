SUMMARY = "Notepad++-like editor"
DESCRIPTION = "Text editor with support for multiple programming languages, \
multiple encodings, and plugins."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "notepadqq-2.1.1-1.1.aarch64.rpm"
RPM_HASH = "6edc871e1dc8aa4cf2aff2467045aaa9018ea08dbe8980b279478c340f0b5e83a54a194723beab12887162c8fad7f17a63309b8e03d3a6eb8fdbaa2a3dd513b6"

RPROVIDES:${PN} += "notepadqq"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/node \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Svg.so.6 \
libQt6WebChannel.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libuchardet.so.0"

inherit rpm
