SUMMARY = "Introspection bindings for librsvg, a SVG render library"
DESCRIPTION = "This package contains a library to render SVG (scalable vector \
graphics) data. This format has been specified by the W3C (see \
http://www.w3c.org). \
 \
This package provides the GObject Introspection bindings for librsvg."
LICENSE = "LGPL-2.0-or-later"

PV = "2.62.3"

RPM_NAME = "typelib-1_0-Rsvg-2_0-2.62.3-2.2.aarch64.rpm"
RPM_HASH = "f5337834b227c327f01347b0c56dafede6484cd00e6f0c124037557377ce6723b5baf4cfa80bfb93df1e5364627a6596d3fbcb7510f69419c35185334e50c3d6"

RPROVIDES:${PN} += "typelib-1-0-Rsvg-2-0 \
typelib-Rsvg"

RDEPENDS:${PN} += "librsvg-2.so.2 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio \
typelib-cairo"

inherit rpm
