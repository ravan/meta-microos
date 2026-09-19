SUMMARY = "XKB Layout Switcher Plugin for the Xfce Panel"
DESCRIPTION = "The XKB plugin allows to setup and switch between multiple XKB keyboard \
layouts."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.0"

RPM_NAME = "xfce4-xkb-plugin-0.9.0-1.4.aarch64.rpm"
RPM_HASH = "c819adf43052a31339bae4b6162f2c041fe0289b16bf028dd5575a20d8439eabf1f70f1ce35bce3cffdaea874948427a36e584af60eb800b79c1021140bc5f51"

RPROVIDES:${PN} += "libxkb.so \
xfce4-panel-plugin-xkb \
xfce4-xkb-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgarcon-1.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
librsvg-2.so.2 \
libwnck-3.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
libxklavier.so.16 \
xfce4-panel \
xfce4-settings"

inherit rpm
