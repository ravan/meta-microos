SUMMARY = "Lua bindings to GObject libraries"
DESCRIPTION = "Dynamic Lua binding to any library which is introspectable \
using gobject-introspection. Allows using GObject-based libraries \
directly from Lua."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "lua55-lgi-0.9.2-7.2.aarch64.rpm"
RPM_HASH = "4e83da8e27960b501f806cc423e35416f4a62ac46c9982bac9d41d79550aaad4488e770593b522c2ce25c43d3d2fc2a19c831009bd6766bf48af2ae1da1cb390"

RPROVIDES:${PN} += "lua55-lgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
lua55"

inherit rpm
