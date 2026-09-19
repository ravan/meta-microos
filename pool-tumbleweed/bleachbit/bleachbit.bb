SUMMARY = "Tool for removing unnecessary files, freeing space, and maintaining privacy"
DESCRIPTION = "BleachBit deletes unnecessary files to free valuable disk space and \
maintain privacy. Rid your system of old junk including broken \
menu entries, cache, cookies, localizations, and temporary files. \
Designed for Linux  systems, it wipes clean Bash, Beagle, Epiphany, \
Firefox, Flash, GNOME, Java, KDE, OpenOffice.org, Opera, RealPlayer, \
VIM, XChat, and more."
LICENSE = "GPL-3.0-only"

PV = "6.0.4"

RPM_NAME = "bleachbit-6.0.4-1.1.noarch.rpm"
RPM_HASH = "888854fdc714cb88e18daaf0afba00a9111b0ba9f727050fc233bd9ce2b380f0b6a0b8d810ba221dc583fb8afacdf37126ec1396481a06eff3aeb2d5b3694c0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bleachbit"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3 \
python3-chardet \
python3-gobject \
python3-gobject-Gdk \
python3-xml \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Notify \
typelib-Pango \
xdg-utils"

inherit rpm
