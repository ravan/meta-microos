SUMMARY = "Xfce Panel Plugin for Monitoring Batteries and Changing the Display Brightness"
DESCRIPTION = "This package provides a plugin for the Xfce panel for monitoring battery and \
device charge levels and to regulate display brightness."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.1"

RPM_NAME = "xfce4-power-manager-plugin-4.20.1-1.1.aarch64.rpm"
RPM_HASH = "eea20acf8a99d6e710fd914039c1a32ff637a9c8052815fda6ebb6e823f8e9edc648f81bde08301a026645ce0c6b0a15a4de79f6f76cd341b5b3bc4ba194fdc5"

RPROVIDES:${PN} += "libxfce4powermanager.so \
xfce4-panel-plugin-brightness \
xfce4-panel-plugin-power-manager \
xfce4-panel-plugin-xfce4battery \
xfce4-power-manager-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libupower-glib.so.3 \
libwayland-client.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
xfce4-panel \
xfce4-power-manager"

inherit rpm
