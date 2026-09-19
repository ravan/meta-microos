SUMMARY = "GStreamer modules and libraries for videoconferencing -- Introspection bindings"
DESCRIPTION = "Farstream is a collection of GStreamer modules and libraries for \
videoconferencing. \
 \
This package provides the GObject Introspection bindings for Farstream."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.9+5"

RPM_NAME = "typelib-1_0-Farstream-0_2-0.2.9+5-3.3.aarch64.rpm"
RPM_HASH = "19754920be6e70c05fac847bcfeb977167950dbaf9344d84d3ded9da6edab783b38a31908f2df62916a36f29bbf4a114c7af377fbba61a732fafdbc485195a32"

RPROVIDES:${PN} += "typelib-1-0-Farstream-0-2 \
typelib-Farstream"

RDEPENDS:${PN} += "libfarstream-0.2.so.5 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst"

inherit rpm
