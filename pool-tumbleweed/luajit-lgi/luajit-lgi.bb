SUMMARY = "Lua bindings to GObject libraries"
DESCRIPTION = "Dynamic Lua binding to any library which is introspectable \
using gobject-introspection. Allows using GObject-based libraries \
directly from Lua."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "luajit-lgi-0.9.2-7.2.aarch64.rpm"
RPM_HASH = "12e8978ac378af124d75f00bb142e8b44d51e2bfed04764d1f89c32be73527cd868797853bcef2af419a355d73f4fe3eb1f86a7833584727a22bfcddbb1da3fc"

RPROVIDES:${PN} += "luajit-lgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
luajit"

inherit rpm
