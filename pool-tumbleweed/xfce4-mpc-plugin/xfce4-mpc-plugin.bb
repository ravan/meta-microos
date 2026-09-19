SUMMARY = "MPD Client Plugin for the Xfce Panel"
DESCRIPTION = "The Mpc plugin is a simple Music Player Daemon client which can control \
playback and show the currently playing song."
LICENSE = "ISC"

PV = "0.6.0"

RPM_NAME = "xfce4-mpc-plugin-0.6.0-1.4.aarch64.rpm"
RPM_HASH = "7403cda0bf7f3a44317af003412a0b0e5ffc407ca10b4a3f75e22279551559bdd9cd92028383310da5c2231b921a94f4d11377330c3ac22f6bc76f2ca0055f3a"

RPROVIDES:${PN} += "libmpc.so \
xfce4-mpc-plugin \
xfce4-panel-plugin-mpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmpd.so.1 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
