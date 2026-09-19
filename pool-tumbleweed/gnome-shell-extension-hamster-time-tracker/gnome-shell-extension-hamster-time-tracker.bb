SUMMARY = "Hamster time tracker extension for GNOME Shell"
DESCRIPTION = " \
GNOME Shell extension to track activities in hamster via the main \
GNOME shell menu. Packaged for openSUSE Factory because the \
upstream version on extensions.gnome.org often leaks behind current \
GNOME shell development."
LICENSE = "GPL-3.0-only"

PV = "3.0.3_0.10.0_50"

RPM_NAME = "gnome-shell-extension-hamster-time-tracker-3.0.3_0.10.0_50-17.2.noarch.rpm"
RPM_HASH = "9b836782d0ace23e4778af28485a91dade0bf409dfe7cd5eab7bbb4ee2f7ba3640bb1edc102d06ab8459ed3aa390d25446ee0366dd764d1c1412e099477c42e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-extension-hamster \
gnome-shell-extension-hamster-time-tracker"

RDEPENDS:${PN} += "gnome-shell \
hamster-time-tracker \
typelib-Adw \
typelib-Clutter \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Meta \
typelib-Shell \
typelib-St"

inherit rpm
