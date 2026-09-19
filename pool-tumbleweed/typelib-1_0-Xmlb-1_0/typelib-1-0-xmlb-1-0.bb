SUMMARY = "Introspection bindings for libxmlb"
DESCRIPTION = "This package provides the GObject Introspection bindings for \
libxmlb."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.29"

RPM_NAME = "typelib-1_0-Xmlb-1_0-0.3.29-2.1.aarch64.rpm"
RPM_HASH = "60f4266cf9800f8a001cc2766717fbaa89a60fe894f4d763d60a8200e7b9958d1dcdff8d91bab9d37ad6285b914afc32e717faa076aaa026521a4f7f7c40f0ae"

RPROVIDES:${PN} += "typelib-1-0-Xmlb-1-0 \
typelib-Xmlb"

RDEPENDS:${PN} += "libxmlb.so.2 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
