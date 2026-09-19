SUMMARY = "Introspection bindings for the BAMF window matching library"
DESCRIPTION = "This package contains introspection data for the Bamf library. \
 \
This package provides the GObject Introspection bindings for Bamf."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "0.5.6"

RPM_NAME = "typelib-1_0-Bamf-3_0-0.5.6-1.17.aarch64.rpm"
RPM_HASH = "fb4dda57e9f8b2dc1fff9d452b95256e0c799adf5b36e984f2c72027ecb34b617ff9d1cdd4a8e2cb4504890366bc4a79682e99fe40bc052c5f8612dcd5c74449"

RPROVIDES:${PN} += "typelib-1-0-Bamf-3-0 \
typelib-Bamf"

RDEPENDS:${PN} += "libbamf3.so.2 \
typelib-GLib \
typelib-GObject"

inherit rpm
