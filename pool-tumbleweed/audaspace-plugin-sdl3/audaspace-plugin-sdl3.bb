SUMMARY = "sdl3 plugin for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library. \
This package contains the sdl3 plugin"
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "audaspace-plugin-sdl3-1.10.0-1.1.aarch64.rpm"
RPM_HASH = "571cdd11e2a7fe0e3f5f7bc161ed519cd2f8600f7d510b796f6666096599fffca325ebd9a53ac207b589ddf1fc08a394d486af7ebad2c003b537e8efb91bf26f"

RPROVIDES:${PN} += "audaspace-deviceplugin \
audaspace-plugin-sdl3 \
libaudsdl.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL3.so.0 \
libaudaspace.so.1.10 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
