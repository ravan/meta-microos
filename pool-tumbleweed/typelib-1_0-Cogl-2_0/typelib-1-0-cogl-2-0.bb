SUMMARY = "Introspection bindings for the cogl GL/GLES abstraction/utility layer"
DESCRIPTION = "Cogl is a library for using 3D graphics hardware to draw \
pretty pictures. \
 \
This package provides the GObject Introspection bindings for Cogl."
LICENSE = "MIT"

PV = "1.22.8"

RPM_NAME = "typelib-1_0-Cogl-2_0-1.22.8-3.7.aarch64.rpm"
RPM_HASH = "18ec26935e4787235a8db8b4bd7afc3dcd18cc031a8fbac3576edfd0a84d193c791840b20a0a2b77979a0a19ce28d633ca9ae59a4d521d80f5bf1a20677b6a8d"

RPROVIDES:${PN} += "typelib-1-0-Cogl-2-0 \
typelib-Cogl"

RDEPENDS:${PN} += "libcogl.so.20 \
typelib-GL \
typelib-GLib \
typelib-GObject"

inherit rpm
