SUMMARY = "An interface for access to applications and documents"
DESCRIPTION = "Kupfer is an interface for access to applications \
and their documents. \
 \
The most typical use is to find a specific application and launch it. \
Kupfer can be extended with plugins so that its quick-access \
paradigm can be extended to many more objects than just \
applications."
LICENSE = "GPL-3.0-or-later"

PV = "329"

RPM_NAME = "kupfer-329-1.2.noarch.rpm"
RPM_HASH = "f4adb69025b668729d6b40aa61bd16597d77eb099fe14e9caa3d6c4471e544aaefa57e3f000f6ea9dc9a046a682cd30076485a598d9bda3f9afc28839fb61941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kupfer"

RDEPENDS:${PN} += "/usr/bin/sh \
desktop-file-utils \
gvfs \
hicolor-icon-theme \
python3-cairo \
python3-dbus-python \
python3-docutils \
python3-gobject \
python3-gobject-Gdk \
python3-pyxdg \
shared-mime-info \
typelib-AyatanaAppIndicator3 \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Keybinder \
typelib-Pango \
typelib-Tracker \
typelib-Wnck"

inherit rpm
