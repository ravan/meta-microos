SUMMARY = "Weather Condition Monitoring Plugin for the Xfce Panel"
DESCRIPTION = "The Weather plugin shows short- and long-term weather forecasts."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.0"

RPM_NAME = "xfce4-weather-plugin-0.12.0-1.5.aarch64.rpm"
RPM_HASH = "5ad3fe6777f2745766bc04b6a4b647fe51f5e892467ae61a80c8d8226c1a6145ba4461a971821fffec324d181e64614e5345aa24b47453e4a314f8b5de08f0ab"

RPROVIDES:${PN} += "libweather.so \
xfce4-panel-plugin-weather \
xfce4-weather-plugin"

RDEPENDS:${PN} += "exo-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjson-c.so.5 \
libm.so.6 \
libpango-1.0.so.0 \
libsoup-3.0.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
libxml2.so.16 \
xfce4-panel"

inherit rpm
