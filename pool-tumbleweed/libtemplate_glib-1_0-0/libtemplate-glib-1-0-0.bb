SUMMARY = "Library for generating text based on a template and user defined state"
DESCRIPTION = "Template-GLib is a library for generating text based on a template and \
user defined state. Template-GLib does not use a language runtime, so it is \
safe to use from any GObject-Introspectable language."
LICENSE = "LGPL-2.1-or-later"

PV = "3.40.0"

RPM_NAME = "libtemplate_glib-1_0-0-3.40.0-1.4.aarch64.rpm"
RPM_HASH = "1deef0b7899e61d64bd2b4d80a22ffa40d976d22b8382e3057634796d403cf7c6bbe7d8710b5fea3f761d7e5f34cc99ada30a43981bae08676df634d86fbc8d8"

RPROVIDES:${PN} += "libtemplate-glib-1-0-0 \
libtemplate-glib-1.0.so.0 \
template-glib"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libgirepository-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6"

inherit rpm
