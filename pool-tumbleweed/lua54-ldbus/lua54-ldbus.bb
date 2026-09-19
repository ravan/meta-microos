SUMMARY = "Lua bindings to dbus"
DESCRIPTION = "ldbus is a C binding to dbus for Lua."
LICENSE = "MIT"

PV = "0.0+git20250404.5cc933b"

RPM_NAME = "lua54-ldbus-0.0+git20250404.5cc933b-2.4.aarch64.rpm"
RPM_HASH = "81104a3fe2e909e95ea26bac96526e4f84beabe7bec8a959bda04905f1a8f7ace7859c5e3a0f2dc56b4cc5107868a5a36f49fe9f8d77fefb7b178bf5d6884f81"

RPROVIDES:${PN} += "lua-ldbus \
lua54-ldbus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
lua54"

inherit rpm
