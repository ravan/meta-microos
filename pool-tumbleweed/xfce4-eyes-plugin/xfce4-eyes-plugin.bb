SUMMARY = "Eyes Plugin for the Xfce Panel"
DESCRIPTION = "The Eyes plugin adds moving eyes to the panel which watch your activities."
LICENSE = "GPL-2.0-or-later"

PV = "4.7.0"

RPM_NAME = "xfce4-eyes-plugin-4.7.0-1.4.aarch64.rpm"
RPM_HASH = "c9421f43485a0bfac3bb791861d6050149e94d960368a81982b9744a4e285770b819d96dee6b006034858cc21d82744e61ef830b92905ffc69b3b1bce9fda261"

RPROVIDES:${PN} += "libeyes.so \
xfce4-eyes-plugin \
xfce4-panel-plugin-eyes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
