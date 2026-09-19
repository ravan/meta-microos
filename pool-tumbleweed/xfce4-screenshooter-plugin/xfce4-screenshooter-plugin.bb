SUMMARY = "Screenshot Plugin for the Xfce Panel"
DESCRIPTION = "This package contains the xfce4-screenshooter Xfce panel plugin."
LICENSE = "GPL-2.0-or-later"

PV = "1.11.3"

RPM_NAME = "xfce4-screenshooter-plugin-1.11.3-2.2.aarch64.rpm"
RPM_HASH = "bb015e4c7cb6149e6d407c901e756c8fb949bd2bab65bd0881ef03ea0d5803c9ed1b8219e88680643630ad7bac17b3f3637aafcd4a42c202afe914f3fe4e47e3"

RPROVIDES:${PN} += "libscreenshooterplugin.so \
xfce4-panel-plugin-screenshooter \
xfce4-screenshooter-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXfixes.so.3 \
libc.so.6 \
libcairo.so.2 \
libexo-2.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwayland-client.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
xfce4-panel \
xfce4-screenshooter"

inherit rpm
