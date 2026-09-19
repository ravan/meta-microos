SUMMARY = "Introspection bindings for grilo"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API. \
 \
This package provides the GObject Introspection bindings for the \
libgrlnet library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.19"

RPM_NAME = "typelib-1_0-GrlNet-0_3-0.3.19-2.5.aarch64.rpm"
RPM_HASH = "1edb469bff0fd0ba15e082a27cf1bc9873fdf53d3af43ea344158e8388b20275eb0a5d82b954191239d48e93b8e570e5044bf09cd60ca6992d4ead95be5b6c46"

RPROVIDES:${PN} += "typelib-1-0-GrlNet-0-3 \
typelib-GrlNet"

RDEPENDS:${PN} += "libgrlnet-0.3.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Soup"

inherit rpm
