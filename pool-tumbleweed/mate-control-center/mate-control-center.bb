SUMMARY = "MATE Desktop control center"
DESCRIPTION = "The control center is MATE's main interface for configuration of various \
aspects of your desktop."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "mate-control-center-1.28.0-1.11.aarch64.rpm"
RPM_HASH = "06a2d600c0119d9e2c1277e3393b4bd33e285c29807d9101ecd652bf91c5b90277e85a390762d07f60feb0c77dc7718426fd3873937d5cd9c08caebe3698f037"

RPROVIDES:${PN} += "mate-control-center"

RDEPENDS:${PN} += "gsettings-backend-dconf \
gsettings-desktop-schemas \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcursor.so.1 \
libXi.so.6 \
libXss.so.1 \
libaccountsservice.so.0 \
libatk-1.0.so.0 \
libayatana-appindicator3.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libdconf.so.1 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtop-2.0.so.11 \
libm.so.6 \
libmarco-private.so.2 \
libmate-desktop-2.so.17 \
libmate-menu.so.2 \
libmatekbd.so.6 \
libmatekbdui.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpolkit-gobject-1.so.0 \
libudisks2.so.0 \
libxklavier.so.16 \
libxml2.so.16 \
mate-control-center-branding"

inherit rpm
