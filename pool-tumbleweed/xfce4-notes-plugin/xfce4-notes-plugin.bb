SUMMARY = "Note-taking Plugin for the Xfce Panel"
DESCRIPTION = "The Notes plugin provides the equivalent to post-it notes on the Xfce desktop \
and allows to quickly take and store small notes."
LICENSE = "GPL-2.0-or-later"

PV = "1.12.0"

RPM_NAME = "xfce4-notes-plugin-1.12.0-1.6.aarch64.rpm"
RPM_HASH = "bc5c8be085ee4de32db440c1ed04dc3852d947f703cb9b9d787e1ae04dd209df87e1e531c1216dbbf5aeac85c049d7e38ca3b9898c7f4fb463d633c9ea94a2f2"

RPROVIDES:${PN} += "libnotes.so \
xfce4-notes-plugin \
xfce4-panel-plugin-notes"

RDEPENDS:${PN} += "exo-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libpango-1.0.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
xfce4-panel"

inherit rpm
