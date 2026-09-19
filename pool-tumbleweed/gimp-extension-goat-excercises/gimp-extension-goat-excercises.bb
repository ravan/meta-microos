SUMMARY = "The GNU Image Manipulation Program"
DESCRIPTION = "The GIMP is an image composition and editing program. GIMP offers \
many tools and filters, and provides a large image manipulation \
toolbox and scripting. \
 \
This subpackage contains example the goat extension examples \
that extend gimp."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.6"

RPM_NAME = "gimp-extension-goat-excercises-3.2.6-1.1.aarch64.rpm"
RPM_HASH = "c6f11e395ec8bc9f5356b65cb06ecb8a542db00a5bdfd83d8456f48139f4b040f2042cc708067ea751fd0e6e2ee9d6d3e813151aa44a60ae0935d990eb5ef3cc"

RPROVIDES:${PN} += "gimp-extension-goat-excercises"

RDEPENDS:${PN} += "/usr/bin/env \
gimp-3.0-devel \
gimp-3.0-plugin-python3 \
gimp-3.0-vala \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgegl-0.4.so.0 \
libgimp-3.0.so.0 \
libgimpbase-3.0.so.0 \
libgimpui-3-0-0 \
libgimpui-3.0.so.0 \
libgimpwidgets-3.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gegl \
typelib-Gimp \
typelib-GimpUi \
typelib-Gio \
typelib-Gtk"

inherit rpm
