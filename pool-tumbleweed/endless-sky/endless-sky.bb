SUMMARY = "Space exploration, trading, and combat game"
DESCRIPTION = "Explore other star systems. Earn money by trading, carrying passengers, \
or completing missions. Use your earnings to buy a better ship or to \
upgrade the weapons and engines on your current one. Blow up pirates. \
Take sides in a civil war. Or leave human space behind and hope to \
find some friendly aliens whose culture is more civilized than your own..."
LICENSE = "CC-BY-3.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GPL-3.0-only"

PV = "0.11.2"

RPM_NAME = "endless-sky-0.11.2-1.1.aarch64.rpm"
RPM_HASH = "1f18269673e62f249e7fde19181fb06974f19328fdd8c97afef4f7bf03830a467991a725edda9d5c07c25b678084ad719d0fa1420bc28579ce23affe202c0974"

RPROVIDES:${PN} += "endless-sky"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC++.so.11 \
libFLAC.so.14 \
libGLEW.so.2.3 \
libOpenGL.so.0 \
libSDL2-2.0.so.0 \
libavif.so.16 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libmad.so.0 \
libminizip.so.1 \
libopenal.so.1 \
libpng16.so.16 \
libstdc++.so.6 \
libuuid.so.1"

inherit rpm
