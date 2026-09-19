SUMMARY = "This is a binding to libunbound for Lua"
DESCRIPTION = "This is a binding to libunbound for Lua"
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "lua55-luaunbound-1.0.0-3.3.aarch64.rpm"
RPM_HASH = "a31d658b0e82f718d6f34a8bb36d4e1c921f303b213194c6758c5d04bd49b1ad733f6308d53afaaf44e485afbdb1dfad5beb76fdfbe759878c9e380811625995"

RPROVIDES:${PN} += "lua55-luaunbound"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.5.so.5 \
libunbound.so.8"

inherit rpm
