SUMMARY = "GPaste status menu extension for GNOME Shell"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This GNOME Shell extension adds a clipboard item in the status \
menu, and provides the ability to copy/paste text."
LICENSE = "BSD-2-Clause"

PV = "50.9"

RPM_NAME = "gnome-shell-extension-gpaste-50.9-1.1.noarch.rpm"
RPM_HASH = "a35cd296a9085cf0b29f338741ef5c2cefd843904456012461823cbb3c3f9d163d52a5a87a534df2241d3cc99a9c136b36a0cc6b645381bee480eb266790bedd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-extension-gpaste"

RDEPENDS:${PN} += "gnome-shell \
gpaste \
typelib-GLib \
typelib-GObject \
typelib-GPaste \
typelib-GPasteGtk \
typelib-Gio \
typelib-Pango"

inherit rpm
