SUMMARY = "Lua bindings to dbus"
DESCRIPTION = "ldbus is a C binding to dbus for Lua."
LICENSE = "MIT"

PV = "0.0+git20250404.5cc933b"

RPM_NAME = "luajit-ldbus-0.0+git20250404.5cc933b-2.4.aarch64.rpm"
RPM_HASH = "2f561109bdd2ba77a8428506a5b6b838e2fccee9ff36cf6b3f967b93f9ba781d47b985bcf3c51cc2e55dc3eb820f7c1d2c45a6807dace34800714d91bca54734"

RPROVIDES:${PN} += "luajit-ldbus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
luajit"

inherit rpm
