SUMMARY = "GTK3 Desktop Environment"
DESCRIPTION = "Budgie Desktop is the flagship desktop for the Solus Operating System."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.10.0+13"

RPM_NAME = "budgie-desktop-10.10.0+13-1.2.aarch64.rpm"
RPM_HASH = "905d75f93bee852db4f9387b2c9b84beca6dd4322b68620d7ac4503c893a9907e83d05f77c7a600c0947b9a0ad67242e09745ce848e5e29e246989ddd1dc6aca"

RPROVIDES:${PN} += "budgie-desktop \
budgie-trash-applet \
libbudgiemenuapplet.so \
libcaffeineapplet.so \
libclockapplet.so \
libgvc.so \
libicontasklistapplet.so \
liblockkeysapplet.so \
libnightlightapplet.so \
libnotificationsapplet.so \
liborg.buddiesofbudgie.budgie-desktop.raven.widget.Calendar.so \
liborg.buddiesofbudgie.budgie-desktop.raven.widget.MediaControls.so \
liborg.buddiesofbudgie.budgie-desktop.raven.widget.SoundInput.so \
liborg.buddiesofbudgie.budgie-desktop.raven.widget.SoundOutput.so \
liborg.buddiesofbudgie.budgie-desktop.raven.widget.UsageMonitor.so \
libplacesindicator.so \
libraventriggerapplet.so \
libseparatorapplet.so \
libshowdesktopapplet.so \
libspacerapplet.so \
libstatusapplet.so \
libtasklistapplet.so \
libtrashapplet.so \
libtrayapplet.so \
libuserindicator.so \
libworkspacesapplet.so"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
NetworkManager-applet \
bluejay \
budgie-backgrounds \
budgie-control-center \
budgie-desktop-branding \
budgie-desktop-services \
budgie-session \
gammastep \
gnome-disk-utility \
gnome-settings-daemon \
grim \
gstreamer \
ibus \
labwc \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libbudgie-appindexer.so.0 \
libbudgie-appindexer0 \
libbudgie-plugin.so.0 \
libbudgie-plugin0 \
libbudgie-private.so.0 \
libbudgie-private0 \
libbudgie-raven-plugin.so.0 \
libbudgie-raven-plugin0 \
libbudgie-windowing.so.0 \
libbudgie-windowing0 \
libbudgietheme.so.0 \
libbudgietheme0 \
libc.so.6 \
libcairo.so.2 \
libcanberra-gtk3-module \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libgirepository-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-desktop-3.so.20 \
libgnomesu \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libnotify-tools \
libnotify.so.4 \
libpango-1.0.so.0 \
libpeas-2.so.0 \
libpolkit-agent-1.so.0 \
libpolkit-gobject-1.so.0 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0 \
libraven.so.0 \
libraven0 \
libupower-glib.so.3 \
libuuid.so.1 \
libxfce4windowing-0.so.0 \
python3-gobject-Gdk \
python3-systemd \
slurp \
swaybg \
swayidle \
swaylock \
typelib-1-0-Budgie-3-0 \
typelib-1-0-BudgieRaven-3-0 \
typelib-GLib \
typelib-Gio \
typelib-Pango \
update-alternatives \
upower \
wlopm \
xdg-desktop-portal \
xdg-desktop-portal-gtk \
xdg-desktop-portal-wlr \
xdg-user-dirs-gtk"

inherit rpm
