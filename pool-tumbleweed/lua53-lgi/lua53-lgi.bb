SUMMARY = "Lua bindings to GObject libraries"
DESCRIPTION = "Dynamic Lua binding to any library which is introspectable \
using gobject-introspection. Allows using GObject-based libraries \
directly from Lua."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "lua53-lgi-0.9.2-7.2.aarch64.rpm"
RPM_HASH = "213ced6d99efbeb42eca4add37698ad80814bd8a86b757fa5ad5cc9a587ebf41ab3413d862015b96c00b7fd36b34a783ffbd6b6d62354a0e932d08c3347d97de"

RPROVIDES:${PN} += "lua53-lgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
lua53"

inherit rpm
