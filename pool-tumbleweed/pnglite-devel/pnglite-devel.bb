SUMMARY = "Files needed to build and link programs with pnglite"
DESCRIPTION = "This contains a header file and a link to library for the linker \
to link against pnglite."
LICENSE = "Zlib"

PV = "0.1.17"

RPM_NAME = "pnglite-devel-0.1.17-2.9.aarch64.rpm"
RPM_HASH = "664a8d01f2433dd7462e1425b6a7fb2a15a2ff6da25eb797b8df15c5d8ceaccd08637a552dd371524b66b28fb756d11e5cc5c960553d4e0a9cb592f1c27a5a1e"

RPROVIDES:${PN} += "pnglite-devel"

RDEPENDS:${PN} += "libpnglite0"

inherit rpm
