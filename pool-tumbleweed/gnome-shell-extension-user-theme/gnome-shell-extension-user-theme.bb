SUMMARY = "Allow the user to change GNOME Shell Themes"
DESCRIPTION = "This extension allows the user to switch to different themes. It's possible \
to pick system installed themes or even themes installed in the user's home."
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "gnome-shell-extension-user-theme-50.3-1.1.noarch.rpm"
RPM_HASH = "bb62dcbea41c3443a8abf09134f00f13e73f954a2de5a6e338a5ede3538145feb82062d989864349f46972145607f2af43f14be0d8a8b70e7e381e71170d7aae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-extension-user-theme"

RDEPENDS:${PN} += "typelib-Adw \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Gtk"

inherit rpm
