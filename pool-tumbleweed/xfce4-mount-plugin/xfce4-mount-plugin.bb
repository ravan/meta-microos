SUMMARY = "Filesystem Mounting Plugin for the Xfce Panel"
DESCRIPTION = "The Mount plugin allows to mount and unmount filesystems from the panel."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "xfce4-mount-plugin-1.2.0-1.4.aarch64.rpm"
RPM_HASH = "6448e1601f8d4f278a69f6dc9aa272e79587c9f8dbfb2d5abe97693f543054f7d3b6e2eb3f582d092787caef16186e0aea78b1d4f71e03f9307027234f9fcbe7"

RPROVIDES:${PN} += "libmount.so \
xfce4-mount-plugin \
xfce4-panel-plugin-mount"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
