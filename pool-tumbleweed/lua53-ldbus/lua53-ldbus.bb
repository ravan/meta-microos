SUMMARY = "Lua bindings to dbus"
DESCRIPTION = "ldbus is a C binding to dbus for Lua."
LICENSE = "MIT"

PV = "0.0+git20250404.5cc933b"

RPM_NAME = "lua53-ldbus-0.0+git20250404.5cc933b-2.4.aarch64.rpm"
RPM_HASH = "b5ce12260b3a01e1c730ec7fae2a0f8e243d5b983efb7b5d44b787964ce50ffd643e6c09e3c69b92cf9df5dfd69edae52c21290f898ae6836cd26110e5ffc047"

RPROVIDES:${PN} += "lua53-ldbus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
lua53"

inherit rpm
