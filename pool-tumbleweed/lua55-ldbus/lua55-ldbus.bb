SUMMARY = "Lua bindings to dbus"
DESCRIPTION = "ldbus is a C binding to dbus for Lua."
LICENSE = "MIT"

PV = "0.0+git20250404.5cc933b"

RPM_NAME = "lua55-ldbus-0.0+git20250404.5cc933b-2.4.aarch64.rpm"
RPM_HASH = "e65f5918b7a112bef6464a6e94f3f6cd133960967ea9dd5c9d52fd931926a560ef8df39965ce4d5924502e15032435c548aec08f84682a054aadc6999ba3ddb3"

RPROVIDES:${PN} += "lua55-ldbus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
lua55"

inherit rpm
