SUMMARY = "Native YouTube Client"
DESCRIPTION = "Minitube is a native YouTube client. With it you can watch YouTube \
videos in a new way: you type a keyword, Minitube gives you an \
endless video stream. \
 \
Minitube is not about cloning the original YouTube web interface, \
it strives to create a new TV-like experience."
LICENSE = "GPL-3.0-or-later"

PV = "4.0"

RPM_NAME = "minitube-4.0-1.1.aarch64.rpm"
RPM_HASH = "6394a7f9e23a3241d0b7851f0c0140dcc3870dad73f9311234856bcd55c429026e6a1bb9476959b75abef7ed97a9d0dc9c57224b11a9f79c4ecdc30f8bc21c67"

RPROVIDES:${PN} += "minitube"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Qml.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libmpv.so.2 \
libstdc++.so.6"

inherit rpm
