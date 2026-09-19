SUMMARY = "Nintendo Entertainment System/Famicom emulator"
DESCRIPTION = "Nestopia is a cycle-accurate NES/Famicom emulator. It has a high compatibility \
rate and support for many peripherals and input devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.53.2"

RPM_NAME = "nestopia-1.53.2-2.4.aarch64.rpm"
RPM_HASH = "38a6c6b945a2391fc9ea6b977dcc41d71c74acda4d047d539515d375b2567efaa8258be154d9947c9743a30904f0ae87f8ca90c9e495cec2899441125df174e2"

RPROVIDES:${PN} += "nestopia"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libarchive.so.13 \
libc.so.6 \
libepoxy.so.0 \
libfltk-gl.so.1.3 \
libfltk-images.so.1.3 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libm.so.6 \
libsamplerate.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
