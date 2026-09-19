SUMMARY = "GObject introspection for libgit2-glib"
DESCRIPTION = "libgit2-glib is a GLib wrapper library around the libgit2 git access library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.1"

RPM_NAME = "typelib-1_0-Ggit-1_0-1.2.1-2.4.aarch64.rpm"
RPM_HASH = "fa5f3dedc242e49d6592b750bf98d37288c66db16f13de09e1b2bbf212fc65f6047ea50109e44200f1c17c46f03d4a232b4cd34f6dca05d3e458d7dc9c2ef252"

RPROVIDES:${PN} += "typelib-1-0-Ggit-1-0 \
typelib-Ggit"

RDEPENDS:${PN} += "libgit2-glib-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
