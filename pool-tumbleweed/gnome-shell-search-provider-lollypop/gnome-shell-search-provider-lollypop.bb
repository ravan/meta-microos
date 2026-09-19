SUMMARY = "GNOME music playing application - gnome-shell search provider"
DESCRIPTION = "Lollypop is a GNOME music playing application. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from lollypop."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.40"

RPM_NAME = "gnome-shell-search-provider-lollypop-1.4.40-1.7.noarch.rpm"
RPM_HASH = "707a7ed98cf2707b77d5e22950f2a8d51f9700c5c3eba6a427d07bd916ae5c5cfb7f25090dc1449dd11f4754bc825aeb44c91c17b2b3836430a43c14583ee9f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-lollypop"

RDEPENDS:${PN} += "/usr/bin/python3 \
gnome-shell \
lollypop \
typelib-GLib \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gst \
typelib-GstPbutils \
typelib-Gtk \
typelib-Secret \
typelib-TotemPlParser"

inherit rpm
