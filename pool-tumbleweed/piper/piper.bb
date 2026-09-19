SUMMARY = "Configuration UI for gaming mice"
DESCRIPTION = "Piper is a GTK+ application to configure gaming mice. It is a graphical frontent \
to the ratbagd DBUS daemon which provides the actual configuration support for the \
devices to any user in the group 'games'."
LICENSE = "GPL-2.0-only"

PV = "0.8"

RPM_NAME = "piper-0.8-2.5.noarch.rpm"
RPM_HASH = "37aad48e4b5d00408311533b4da76461ee48cb32bd1b8e05e039410334b5f5f5e1eeb4cc8e2f94dfe6c2f05b1ecd8197d4a526a6287fbc5cf0c3dc0aa348de43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "piper"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-cairo \
python3-evdev \
python3-gobject \
python3-gobject-Gdk \
python3-lxml \
ratbagd \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkX11 \
typelib-Gio \
typelib-Gtk \
typelib-Rsvg"

inherit rpm
