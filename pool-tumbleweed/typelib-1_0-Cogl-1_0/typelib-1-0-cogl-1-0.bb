SUMMARY = "Introspection bindings for the cogl GL/GLES abstraction/utility layer"
DESCRIPTION = "Cogl is a library for using 3D graphics hardware to draw \
pretty pictures. \
 \
This package provides the GObject Introspection bindings for Cogl."
LICENSE = "MIT"

PV = "1.22.8"

RPM_NAME = "typelib-1_0-Cogl-1_0-1.22.8-3.7.aarch64.rpm"
RPM_HASH = "897e79e17dffe97c2ce4e4483db72d8617b6b3197e30ee79862c23e88061a14c859acb7e77a893859e28177664164a18d69851bb857d1a4c8601185682cbc92b"

RPROVIDES:${PN} += "typelib-1-0-Cogl-1-0 \
typelib-Cogl"

RDEPENDS:${PN} += "libcogl.so.20 \
typelib-GL \
typelib-GLib \
typelib-GObject"

inherit rpm
