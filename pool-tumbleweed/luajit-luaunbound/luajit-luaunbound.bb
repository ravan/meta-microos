SUMMARY = "This is a binding to libunbound for Lua"
DESCRIPTION = "This is a binding to libunbound for Lua"
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "luajit-luaunbound-1.0.0-3.3.aarch64.rpm"
RPM_HASH = "4fbf6eddea158298b442a43c8c50cc233373d193c3ab14856cd4fe8f11e4ef3de4501232f294dab4534a157dc4d720a9983d2319ddfe0b6c6a3d57c66b1c5203"

RPROVIDES:${PN} += "luajit-luaunbound"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libluajit-5.1.so.2 \
libunbound.so.8"

inherit rpm
