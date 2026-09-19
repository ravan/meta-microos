SUMMARY = "A tool to customize advanced GNOME 3 options"
DESCRIPTION = "GNOME Tweak Tool is an application for changing the advanced settings \
of GNOME 3."
LICENSE = "CC0-1.0 & GPL-3.0-or-later"

PV = "49.0"

RPM_NAME = "gnome-tweaks-49.0-2.2.noarch.rpm"
RPM_HASH = "7775a4034bfc1b06995b1256a83084d43733219a789d8b9012dde4be76ac12f5db0334aaf65348a6c0e967ecb2dbd98780bd7b4e8e500271eddc7a04b720aedc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-tweak-tool \
gnome-tweaks"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
gnome-settings-daemon \
gnome-shell \
gsettings-desktop-schemas \
mutter \
python-abi \
python3-base \
python3-gobject \
python3-gobject-Gdk \
python3-xml \
typelib-Adw \
typelib-GDesktopEnums \
typelib-GLib \
typelib-GObject \
typelib-GUdev \
typelib-Gdk \
typelib-Gio \
typelib-GnomeDesktop \
typelib-Gtk \
typelib-Notify \
typelib-Pango"

inherit rpm
