SUMMARY = "C/C++ library for processing large images"
DESCRIPTION = "VIPS is an image processing system. It is good with large images \
(images larger than the amount of RAM you have available), with many CPUs, \
for working with colour, for scientific analysis and for general \
research and development."
LICENSE = "LGPL-2.1-only"

PV = "8.18.5"

RPM_NAME = "typelib-1_0-Vips-8.0-8.18.5-1.3.aarch64.rpm"
RPM_HASH = "0f3f2253faeaaa535be873b6ac1381effb1d125f261cbe8e402f0d3aa1d24d419c8c255ce8ea70374ab1c25330b0bc26814872d89fb9ab8d04f4803ab09da07a"

RPROVIDES:${PN} += "typelib-1-0-Vips-8.0 \
typelib-Vips"

RDEPENDS:${PN} += "libvips.so.42 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
