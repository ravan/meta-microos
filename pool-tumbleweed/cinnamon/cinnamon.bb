SUMMARY = "GNU/Linux Desktop featuring a traditional layout"
DESCRIPTION = "Cinnamon is a modern Linux desktop which provides advanced innovative \
features and a traditional user experience. It's easy to use, \
powerful and flexible."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "6.4.6"

RPM_NAME = "cinnamon-6.4.6-3.6.aarch64.rpm"
RPM_HASH = "9f47b1a00b5c1fbff99151744d460366082fbac75ea62d327c62e3799664dd5d25a0e6c77b9538e657045651d89fa0f8a0caeaae854fb988be8962a316cbf94b"

RPROVIDES:${PN} += "cinnamon \
cinnamon-2d \
cinnamon-menu-editor \
cinnamon-settings \
config-cinnamon \
libcinnamon.so \
libst.so \
typelib-1-0-Cinnamon-0-1 \
typelib-Cinnamon \
typelib-St"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
NetworkManager-applet \
adwaita-icon-theme \
cinnamon-control-center-common \
cinnamon-gschemas \
cinnamon-screensaver \
cinnamon-session \
cinnamon-settings-daemon \
cjs \
cups-pk-helper \
dbus-1 \
gettext-runtime \
glib2-tools \
gnomekbd-tools \
iso-country-flags-png \
ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libX11.so.6 \
libXfixes.so.3 \
libatk-1.0.so.0 \
libatk-bridge-2.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libcinnamon-desktop-data \
libcinnamon-desktop.so.4 \
libcinnamon-menu-3.so.0 \
libcjs.so.0 \
libgcr-base-3.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libmuffin-clutter-0.so.0 \
libmuffin-cogl-0.so.0 \
libmuffin-cogl-pango-0.so.0 \
libmuffin-cogl-path-0.so.0 \
libmuffin.so.0 \
libnm.so.0 \
libpango-1.0.so.0 \
libpolkit-agent-1.so.0 \
libpolkit-gobject-1.so.0 \
libsecret-1.so.0 \
libxapp.so.1 \
libxml2.so.16 \
muffin \
nemo \
pkgconfig \
polkit-gnome \
python-abi \
python3-Pillow \
python3-cairo \
python3-dbus-python \
python3-distro \
python3-gobject \
python3-gobject-Gdk \
python3-gobject-cairo \
python3-pexpect \
python3-pyinotify \
python3-python-pam \
python3-pytz \
python3-tinycss2 \
typelib-AccountsService \
typelib-Atk \
typelib-CDesktopEnums \
typelib-CMenu \
typelib-Caribou \
typelib-CinnamonDesktop \
typelib-Clutter \
typelib-ClutterX11 \
typelib-Cogl \
typelib-CoglPango \
typelib-Cvc \
typelib-ECal \
typelib-EDataServer \
typelib-GIRepository \
typelib-GL \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GSound \
typelib-Gck \
typelib-Gcr \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gtk \
typelib-HarfBuzz \
typelib-ICal \
typelib-ICalGLib \
typelib-Json \
typelib-Keybinder \
typelib-Meta \
typelib-NM \
typelib-NMA \
typelib-Nemo \
typelib-Notify \
typelib-Pango \
typelib-PangoCairo \
typelib-Polkit \
typelib-PolkitAgent \
typelib-Soup \
typelib-TimezoneMap \
typelib-UPowerGlib \
typelib-XApp \
typelib-cairo \
typelib-freetype2 \
typelib-xfixes \
typelib-xlib \
update-alternatives \
wget \
xdg-user-dirs \
xdg-user-dirs-gtk"

inherit rpm
