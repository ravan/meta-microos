SUMMARY = "A runtime and development kit using SDL and Squirrel"
DESCRIPTION = "Brux (formerly XYG) is a cross-platform, runtime-based game \
development kit using the Squirrel language. It allows for games to \
be written by hand in a text editor or made in an IDE similar to Game \
Maker, and allows games to be ported with little to no modification \
to the code, offering a 'build once, run everywhere' development \
process."
LICENSE = "AGPL-3.0-only"

PV = "0.2.11+git20250218"

RPM_NAME = "brux-gdk-0.2.11+git20250218-2.5.aarch64.rpm"
RPM_HASH = "6bac67a8f9426973b1f300684930fb740ff2cf640120ad6db2ac6f46a5d8dedf3e8136a13a0603dfc740fb53747f69bc4ecce6d4a40ff3bdff36b7fa6aa36825"

RPROVIDES:${PN} += "brux-gdk"

RDEPENDS:${PN} += "libSDL2-2.0.so.0 \
libSDL2-gfx-1.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libphysfs.so.1 \
libstdc++.so.6"

inherit rpm
