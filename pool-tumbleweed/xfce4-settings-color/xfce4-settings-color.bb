SUMMARY = "Subpackage providing xfce4-color-settings"
DESCRIPTION = "The Xfce Color Profile settings tool is a front-end to set up color management \
for printers, scanners, and displays."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "4.20.5"

RPM_NAME = "xfce4-settings-color-4.20.5-1.1.aarch64.rpm"
RPM_HASH = "787dcc193139ec257448d76d7d78daa156155275743ff6ea4e8e82c717bb20c676ad9c301d0e6f59639aab850c1aeeec64ca632d15dab3dca81649d903751bf3"

RPROVIDES:${PN} += "xfce4-color-settings \
xfce4-settings-color"

RDEPENDS:${PN} += "colord \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcolord.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
sane-backends \
xfce4-settings \
xiccd"

inherit rpm
