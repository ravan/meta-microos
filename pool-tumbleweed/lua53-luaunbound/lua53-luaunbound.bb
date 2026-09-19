SUMMARY = "This is a binding to libunbound for Lua"
DESCRIPTION = "This is a binding to libunbound for Lua"
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "lua53-luaunbound-1.0.0-3.3.aarch64.rpm"
RPM_HASH = "ac449d24f36f4b83c78761b9ad520f6b756e1088322438da9d6520628420439255402d22e60640c7c99c03286ad0652ae352773dc69f1394f24ec00d3daf5c9e"

RPROVIDES:${PN} += "lua53-luaunbound"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.3.so.5 \
libunbound.so.8"

inherit rpm
