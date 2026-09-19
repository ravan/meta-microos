SUMMARY = "Mate status applet with HIDPI support"
DESCRIPTION = "Mate status applet with HIDPI support"
LICENSE = "GPL-3.0-or-later"

PV = "3.2.2"

RPM_NAME = "xapp-mate-3.2.2-1.4.noarch.rpm"
RPM_HASH = "46f38cae13d1b76c7fd0d0b22859d7ad7815bb725b91fd63eb780a98d02d1a73c2306c1c11fe1694629d2e191bb39ecd8e829b03f7a47ff0a8afe583ad6c02bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xapp-mate \
xapps-mate"

RDEPENDS:${PN} += "/usr/bin/python3 \
libxapp1 \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-MatePanelApplet \
typelib-XApp"

inherit rpm
