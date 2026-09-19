SUMMARY = "The GNOME Control Center"
DESCRIPTION = "The control center is GNOME's main interface for configuration of \
various aspects of your desktop."
LICENSE = "GPL-2.0-or-later"

PV = "50.4"

RPM_NAME = "gnome-control-center-50.4-1.1.aarch64.rpm"
RPM_HASH = "adbd059a20383625bee095cb5ea0897bc24a7f72629c294b5291cc817932c9e11e10c8f68b6bacd2320f1ad2300214d86edbed62567a578fead54aa0553b8fbd"

RPROVIDES:${PN} += "gnome-control-center"

RDEPENDS:${PN} += "gnome-settings-daemon \
gnome-themes-accessibility \
gnome-version \
iso-codes \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libaccountsservice.so.0 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libcolord-gtk4.so.1 \
libcolord.so.2 \
libcups.so.2 \
libepoxy.so.0 \
libfontconfig.so.1 \
libgcr-4.so.4 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-bg-4.so.2 \
libgnome-bluetooth-ui-3.0.so.13 \
libgnome-desktop-4.so.2 \
libgnutls.so.30 \
libgoa-1.0.so.0 \
libgoa-backend-1.0.so.2 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgsound.so.0 \
libgtk-4.so.1 \
libgtop-2.0.so.11 \
libgudev-1.0.so.0 \
libibus-1.0.so.5 \
libjson-glib-1.0.so.0 \
libkrb5.so.3 \
libm.so.6 \
libmm-glib.so.0 \
libnm.so.0 \
libnma-gtk4.so.0 \
libpango-1.0.so.0 \
libpolkit-gobject-1.so.0 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0 \
libpwquality.so.1 \
libsecret-1.so.0 \
libsmbclient.so.0 \
libudisks2.so.0 \
libupower-glib.so.3 \
libwacom.so.9 \
libwayland-client.so.0 \
libxml2.so.16 \
tecla-keyboard-layout-viewer"

inherit rpm
