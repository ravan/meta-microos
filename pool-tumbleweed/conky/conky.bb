SUMMARY = "A System Monitor"
DESCRIPTION = "Conky is an configurable system monitor."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "1.24.2"

RPM_NAME = "conky-1.24.2-1.1.aarch64.rpm"
RPM_HASH = "0ce1dd5ecdf5cf4732c72636fa129cd93b63d4993a8acf88b647c8f3c7b6cd19f43a96d3edb83599a94309981b53f060d35eb48dd89a87ccfbbdd135f251036e"

RPROVIDES:${PN} += "config-conky \
conky \
conky-cairo \
conky-feature-nvidia \
conky-imlib2 \
libcairo-imlib2-helper.so \
libcairo-text-helper.so \
libcairo-xlib.so \
libcairo.so \
libimlib2.so \
librsvg.so \
libtcp-portmon.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/lua5.3 \
fontawesome-fonts \
imlib2-loaders \
ld-linux-aarch64.so.1 \
libImlib2.so.1 \
libX11.so.6 \
libXNVCtrl.so.0 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXft.so.2 \
libXi.so.6 \
libXinerama.so.1 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libgobject-2.0.so.0 \
libharfbuzz.so.0 \
libical.so.3 \
libircclient.so.1 \
libiw.so.30 \
liblua5.3.so.5 \
libm.so.6 \
libmariadb.so.3 \
libmicrohttpd.so.12 \
libncurses.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpulse.so.0 \
librsvg-2.so.2 \
libstdc++.so.6 \
libtinfo.so.6 \
libwayland-client.so.0 \
libxml2.so.16"

inherit rpm
