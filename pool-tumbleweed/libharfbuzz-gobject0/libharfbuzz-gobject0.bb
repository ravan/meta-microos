SUMMARY = "GObject wrapper around the HarfBuzz OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package contains the GObject library."
LICENSE = "MIT"

PV = "14.4.0"

RPM_NAME = "libharfbuzz-gobject0-14.4.0-1.1.aarch64.rpm"
RPM_HASH = "1554e82904d6f699addf743c784a333e876e2667c1efc3c502ab53c7ce1338d02de9c90dd8171e02665de75c97aaca7c2d008ee9f557e28a687d5b9561e622a7"

RPROVIDES:${PN} += "libharfbuzz-gobject.so.0 \
libharfbuzz-gobject0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libharfbuzz.so.0"

inherit rpm
