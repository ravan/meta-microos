SUMMARY = "Notifications Library -- Introspection bindings"
DESCRIPTION = "D-BUS notifications library. \
 \
This package provides the GObject Introspection bindings for libnotify."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.8"

RPM_NAME = "typelib-1_0-Notify-0_7-0.8.8-2.4.aarch64.rpm"
RPM_HASH = "b76a7e0ad3695207fbb4f8c39ba32fb6047903a3cb1f5d7a3ec8b2b0508024bb3b98aaf6858736850e77d79a28c9b7aeabe410f328a14bcdb099a8bb72443f70"

RPROVIDES:${PN} += "typelib-1-0-Notify-0-7 \
typelib-Notify"

RDEPENDS:${PN} += "libnotify.so.4 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio"

inherit rpm
