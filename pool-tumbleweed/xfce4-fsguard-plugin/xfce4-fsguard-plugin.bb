SUMMARY = "Filesystem Space Monitoring Plugin for the Xfce Panel"
DESCRIPTION = "The FSGuard plugin constantly monitors free space of a given mountpoint and \
displays it as an icon in the panel."
LICENSE = "BSD-2-Clause"

PV = "1.2.0"

RPM_NAME = "xfce4-fsguard-plugin-1.2.0-1.4.aarch64.rpm"
RPM_HASH = "a2a719dc493f03ec737e92a70350019125f1af15feb16b688f658e8e8d1a7caee9d861dca6a5c5a7a7f74a9558a7c0e390abe6338ecfbde310e44e004a9af89e"

RPROVIDES:${PN} += "libfsguard.so \
xfce4-fsguard-plugin \
xfce4-panel-plugin-fsguard"

RDEPENDS:${PN} += "exo-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
