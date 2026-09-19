SUMMARY = "GNOME Shell"
DESCRIPTION = "The GNOME Shell redefines user interactions with the GNOME desktop. In \
particular, it offers new paradigms for launching applications, accessing \
documents, and organizing open windows in GNOME."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "50.4"

RPM_NAME = "gnome-shell-50.4-1.1.aarch64.rpm"
RPM_HASH = "ba7cf747681ceadfb5cee93ccee20a7dc39bf849bfa975e9d0f07a0e37fdde0252432dbc2d283cfd444df8aeafcd41997e150440d087262ff92e91610ad4e27d"

RPROVIDES:${PN} += "dbus-org.freedesktop.Notifications \
gnome-shell \
libgnome-shell-menu.so \
libgvc.so \
libshell-18.so \
libshew-0.so \
libst-18.so \
typelib-Gvc \
typelib-Shell \
typelib-Shew \
typelib-St"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
gjs \
gnome-control-center \
gnome-session \
gnome-settings-daemon \
gnome-themes-accessibility \
gsettings-desktop-schemas \
gstreamer-plugin-pipewire \
ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libX11.so.6 \
libXext.so.6 \
libXfixes.so.3 \
libatk-1.0.so.0 \
libatk-bridge-2.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgcr-4.so.4 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgirepository-2.0.so.0 \
libgjs.so.0 \
libglib-2.0.so.0 \
libgnome-autoar-0.so.0 \
libgnome-desktop-4.so.2 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libmutter-18.so.0 \
libmutter-clutter-18.so.0 \
libmutter-cogl-18.so.0 \
libmutter-mtk-18.so.0 \
libnm.so.0 \
libpango-1.0.so.0 \
libpipewire-0.3.so.0 \
libpolkit-agent-1.so.0 \
libpolkit-gobject-1.so.0 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0 \
libsecret-1.so.0 \
libsoup-3.0.so.0 \
libsystemd.so.0 \
mutter \
typelib-AccountsService \
typelib-Adw \
typelib-Atk \
typelib-Atspi \
typelib-GDesktopEnums \
typelib-GL \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GWeather \
typelib-Gck \
typelib-Gcr \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gdm \
typelib-Geoclue \
typelib-Gio \
typelib-GioUnix \
typelib-GnomeBG \
typelib-GnomeBluetooth \
typelib-GnomeDesktop \
typelib-Graphene \
typelib-Gsk \
typelib-Gst \
typelib-Gtk \
typelib-Gvc \
typelib-HarfBuzz \
typelib-IBus \
typelib-Malcontent \
typelib-Mtk \
typelib-NM \
typelib-NMA4 \
typelib-Pango \
typelib-PangoCairo \
typelib-Polkit \
typelib-PolkitAgent \
typelib-Rsvg \
typelib-Shell \
typelib-Shew \
typelib-Soup \
typelib-UPowerGlib \
typelib-WebKit \
typelib-cairo \
typelib-freetype2 \
typelib-xfixes \
typelib-xlib"

inherit rpm
