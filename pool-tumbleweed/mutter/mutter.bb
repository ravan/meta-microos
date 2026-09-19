SUMMARY = "Window and compositing manager based on Clutter"
DESCRIPTION = "Mutter is a window and compositing manager based on Clutter, forked \
from Metacity."
LICENSE = "GPL-2.0-or-later"

PV = "50.4"

RPM_NAME = "mutter-50.4-1.1.aarch64.rpm"
RPM_HASH = "45fd818cc5e70876ba38e5df2ccaa2b208551e98a985374ff4e4b1d85bd864fe87bd9da5d9be88758c1296d9b00089fe5d29aa5a0bce0764261526a0e36ce9f9"

RPROVIDES:${PN} += "libdefault.so \
libmutter-18.so.0 \
libmutter-clutter-18.so.0 \
libmutter-cogl-18.so.0 \
libmutter-mtk-18.so.0 \
mutter \
typelib-Clutter \
typelib-Cogl \
typelib-Meta \
typelib-Mtk \
windowmanager"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/env \
glycin-loaders \
gnome-settings-daemon \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libGLESv2.so.2 \
libX11-xcb.so.1 \
libX11.so.6 \
libXau.so.6 \
libXcomposite.so.1 \
libXcursor.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libadwaita-1.so.0 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libcanberra.so.0 \
libcolord.so.2 \
libdisplay-info.so.3 \
libdrm.so.2 \
libei.so.1 \
libeis.so.1 \
libfribidi.so.0 \
libgbm.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libglycin-2.so.0 \
libgmodule-2.0.so.0 \
libgnome-desktop-4.so.2 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libgudev-1.0.so.0 \
libharfbuzz.so.0 \
libinput.so.10 \
liblcms2.so.2 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpipewire-0.3.so.0 \
libpixman-1.so.0 \
libstartup-notification-1.so.0 \
libsystemd.so.0 \
libudev.so.1 \
libwacom.so.9 \
libwayland-server.so.0 \
libxcb-res.so.0 \
libxcb.so.1 \
libxkbcommon.so.0 \
libxkbregistry.so.0 \
typelib-Atk \
typelib-GDesktopEnums \
typelib-GL \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Graphene \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xfixes \
typelib-xlib"

inherit rpm
