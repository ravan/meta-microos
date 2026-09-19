SUMMARY = "Simple application to manage Xfce panel layouts"
DESCRIPTION = "Simple application to manage Xfce panel layouts. \
 \
This tool makes it possible to backup, restore, import, and export panel layouts."
LICENSE = "GPL-3.0-only"

PV = "1.1.1"

RPM_NAME = "xfce4-panel-profiles-1.1.1-1.4.noarch.rpm"
RPM_HASH = "4795921aece1a1a890d63fabfaadc65915a8b45ae9acbd132aadfb6eb3d72b2a42df61f21348e7d285ecb128094ba21137b5a6dbc4af4604ffec07339dfb6e9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xfce4-panel-profiles"

RDEPENDS:${PN} += "/usr/bin/sh \
python3 \
python3-base \
python3-gobject \
python3-gobject-Gdk \
python3-psutil \
typelib-GLib \
typelib-Gio \
typelib-Gtk \
typelib-Libxfce4ui \
typelib-Libxfce4util \
xfce4-panel"

inherit rpm
