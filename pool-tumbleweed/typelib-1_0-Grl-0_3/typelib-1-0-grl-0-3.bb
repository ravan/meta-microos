SUMMARY = "Framework for browsing and searching media content -- Introspection bindings"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API. \
 \
This package provides the GObject Introspection bindings for the \
libgrl library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.19"

RPM_NAME = "typelib-1_0-Grl-0_3-0.3.19-2.5.aarch64.rpm"
RPM_HASH = "a22b195639b14ca8e981ef2cc6716cf07a354b27f1f51342f537f48b7d7a9c0ea2704281c57130dbefbab0436a59fc7f404dec570d3e868cf5a4c559ba3ae2fa"

RPROVIDES:${PN} += "typelib-1-0-Grl-0-3 \
typelib-Grl"

RDEPENDS:${PN} += "libgrilo-0.3.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
