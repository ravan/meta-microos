SUMMARY = "Simple on-screen Keyboard"
DESCRIPTION = "Onboard is an onscreen keyboard useful for tablet PC users and for mobility impaired users."
LICENSE = "GPL-3.0-only"

PV = "1.4.4.5"

RPM_NAME = "onboard-1.4.4.5-2.1.aarch64.rpm"
RPM_HASH = "c9d06e704fdb399188328753c670ff14278ea3bc62bcdf43a812bb572523d57e2b45d761e9f336884a73deb2178630d081bc54a6d460ba2ba0bd360d0e13d455"

RPROVIDES:${PN} += "config-onboard \
onboard \
python3.13dist-onboard \
python3dist-onboard"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/python3.13 \
dbus-1-python3 \
gdk-pixbuf-loader-rsvg \
gsettings-desktop-schemas \
hicolor-icon-theme \
iso-codes \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libXtst.so.6 \
libc.so.6 \
libcairo.so.2 \
libcanberra.so.0 \
libdconf.so.1 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libhunspell-1.7.so.0 \
libm.so.6 \
libstdc++.so.6 \
libudev.so.1 \
libxkbfile.so.1 \
python-abi \
python3-cairo \
python3-gobject-Gdk \
python3-gobject-cairo \
typelib-AppIndicator3 \
typelib-Atspi \
typelib-AyatanaAppIndicator3 \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkX11 \
typelib-Gio \
typelib-Gtk \
typelib-GtkLayerShell \
typelib-Pango \
typelib-PangoCairo"

inherit rpm
