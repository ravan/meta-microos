SUMMARY = "The urfkill glib library-- Introspection bindings"
DESCRIPTION = "Urfkill add-on library to integrate the standard urfkill library with \
the GLib thread abstraction and main loop. \
 \
This package provides the GObject Introspection bindings for urfkill."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "typelib-1_0-Urfkill-0_0-0.5.0-6.7.aarch64.rpm"
RPM_HASH = "411099a321c356281eac2df67590bf9ec626fff6a8c8a6c14f4e592aa9bae7e6651e96e6c8d56c7cdff07eb6d70e198f39029ff8242957f39ce39d75e4e7d681"

RPROVIDES:${PN} += "typelib-1-0-Urfkill-0-0 \
typelib-Urfkill"

RDEPENDS:${PN} += "liburfkill-glib.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
