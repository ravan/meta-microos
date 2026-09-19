SUMMARY = "Xdg-user-dir support for Gnome and Gtk+ applications"
DESCRIPTION = "A companion to xdg-user-dirs that integrates it into the Gnome desktop \
and Gtk+ applications. Presents a dialog when a user changes locales \
to help move they standard user directories to the correct names."
LICENSE = "GPL-2.0-or-later"

PV = "0.16"

RPM_NAME = "xdg-user-dirs-gtk-0.16-2.2.aarch64.rpm"
RPM_HASH = "55a08c6e09b9793de7983f0b6a5f470fe21f4d1815384f01255caac13290c6647b63bd7ec9d4bc7cd052b9408e30ce033e6168f3ff541afea39376c0498ede63"

RPROVIDES:${PN} += "config-xdg-user-dirs-gtk \
xdg-user-dirs-gtk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
xdg-user-dirs"

inherit rpm
