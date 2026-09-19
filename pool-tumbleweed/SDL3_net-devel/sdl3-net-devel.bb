SUMMARY = "Development files for the SDL3 networking library"
DESCRIPTION = "This is a networking library for use with SDL."
LICENSE = "Zlib"

PV = "3.2.0"

RPM_NAME = "SDL3_net-devel-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "4b3955a7bdab7d9535e6bd53a7c428b5aec8d60e8d09498ce60adc5278ada95d7e849f73f6076eac9b01b2532ca05a39504e4ebb84cc43cf0736bb83bf8e4c69"

RPROVIDES:${PN} += "SDL3-net-devel \
cmake-SDL3-net \
libSDL3-net-devel \
pkgconfig-sdl3-net"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL3-net0 \
pkgconfig-sdl3"

inherit rpm
