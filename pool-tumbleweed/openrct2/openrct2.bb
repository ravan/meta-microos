SUMMARY = "An open source re-implementation of Roller Coaster Tycoon 2"
DESCRIPTION = "An open source clone of RollerCoaster Tycoon 2 \
that depends on the original game assets. On first \
game start it will create a ~/.config/OpenRCT2/config.ini file \
where the game_path = '' setting has to be set to a directory \
into which the original game has been installed to."
LICENSE = "GPL-3.0-only"

PV = "0.5.4"

RPM_NAME = "openrct2-0.5.4-27.1.aarch64.rpm"
RPM_HASH = "770707af6f0ec247ef8864aabf4eaa83ab7ff620a9a0d19ff2639a9a64c3b4bad27966e13196f9f7cad1345af3538c70fa6897ffda6408f7a241c8fd9e9fa251"

RPROVIDES:${PN} += "libopenrct2.so \
openrct2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libSDL2-2.0.so.0 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libicuuc.so.78 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libvorbisfile.so.3 \
libz.so.1 \
libzip.so.5 \
libzstd.so.1"

inherit rpm
