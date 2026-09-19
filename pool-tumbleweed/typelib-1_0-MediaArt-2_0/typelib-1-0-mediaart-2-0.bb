SUMMARY = "Introspection bindings for the Media Art extraction library"
DESCRIPTION = "The libmediaart library is the foundation for media art caching, \
extraction and lookup for applications on the desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.7"

RPM_NAME = "typelib-1_0-MediaArt-2_0-1.9.7-1.8.aarch64.rpm"
RPM_HASH = "f4e2fe676ebeaf90f3cd25918cc85a945db85f5572c81c10a3b2907164e47488f8c2eddbb7440ab04befc8a205b68094a393cd28b0f556f54d0574b39f363619"

RPROVIDES:${PN} += "typelib-1-0-MediaArt-2-0 \
typelib-MediaArt"

RDEPENDS:${PN} += "libmediaart-2.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
