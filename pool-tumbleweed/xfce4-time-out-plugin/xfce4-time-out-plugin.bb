SUMMARY = "Time-out Plugin for the Xfce Panel"
DESCRIPTION = "The Time-out plugin allows to take breaks from computer work in configurable, \
periodical intervals and will provide a notification and lock the screen each \
the break time has been reached."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "xfce4-time-out-plugin-1.2.0-1.4.aarch64.rpm"
RPM_HASH = "b7a4d123add793b2337e1b77e855b76c4342c56db5f45ee244f9bee5b774082679969f782c129324a581e00057bc0f60d7d8f2bc1be07380bfdd59a8cc2b454a"

RPROVIDES:${PN} += "libtime-out.so \
xfce4-panel-plugin-timeout \
xfce4-time-out-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
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
