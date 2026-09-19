SUMMARY = "Common files for GNOME's printer administration tool"
DESCRIPTION = "system-config-printer is a graphical user interface that allows the \
user to configure a CUPS print server. \
 \
This package provides files common to various binaries."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.18"

RPM_NAME = "system-config-printer-common-1.5.18-9.6.noarch.rpm"
RPM_HASH = "d8618687fa250176ce6b04fc4abba752fa71a6987d08a08a8aa2d9c11957d49a3e4f9cc229e03cd475dbcf678e735ffa8110e5d0ea9abd0710a90606dae06ba5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "system-config-printer-common"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
dbus-1-python3 \
python3-cairo \
python3-cups \
python3-cupshelpers \
python3-gobject \
python3-gobject-Gdk \
python3-smbc \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gtk \
typelib-Handy \
typelib-Notify \
typelib-PackageKitGlib \
typelib-Pango \
typelib-Polkit \
typelib-Secret"

inherit rpm
