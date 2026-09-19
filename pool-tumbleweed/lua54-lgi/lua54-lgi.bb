SUMMARY = "Lua bindings to GObject libraries"
DESCRIPTION = "Dynamic Lua binding to any library which is introspectable \
using gobject-introspection. Allows using GObject-based libraries \
directly from Lua."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "lua54-lgi-0.9.2-7.2.aarch64.rpm"
RPM_HASH = "bc9b6a6c781750ec39fb3b8c5cbb7de410b44b2e7caf09f4a2fb3e885469cbf2d33d83fea0ba74695bd289381d8e461f5befec25ea3fd0d2444fbf3533f2d413"

RPROVIDES:${PN} += "lua-lgi \
lua54-lgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
lua54"

inherit rpm
