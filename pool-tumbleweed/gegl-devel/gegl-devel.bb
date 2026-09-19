SUMMARY = "Development files for the GEGL 'Generic Graphics Library'"
DESCRIPTION = "GEGL provides infratructure to do demand based cached non destructive \
image editing on larger than RAM buffers. Through babl, it provides \
support for a wide range of color models and pixel storage formats for \
input and output."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.4.72"

RPM_NAME = "gegl-devel-0.4.72-1.1.aarch64.rpm"
RPM_HASH = "cdbbd073b9f9974f2bcda902e4d6ebae8716fd76adaca82f29bfdf0b3cec286092ba7b344601cdd3980301035214546ceae59e97d3f99c79c35ccde60579581f"

RPROVIDES:${PN} += "gegl-devel \
pkgconfig-gegl-0.4 \
pkgconfig-gegl-sc-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgegl-0-4-0 \
pkgconfig-babl-0.1 \
pkgconfig-gegl-0.4 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-json-glib-1.0 \
typelib-1-0-Gegl-0-4"

inherit rpm
