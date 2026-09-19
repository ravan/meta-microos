SUMMARY = "Micro-compositor optimized for running video games on Wayland"
DESCRIPTION = "gamescope is a micro-compositor optimized for running video games on Wayland"
LICENSE = "BSD-2-Clause"

PV = "3.16.28"

RPM_NAME = "gamescope-3.16.28-1.1.aarch64.rpm"
RPM_HASH = "6d795dc296a9301d8302cbaeaba9b2e0dd5d08e35831e2580181a474d275d5522e99669be104e363ca54db22fa864b5b24ceeeaaf43ceaa17e33ea2507aed0dd"

RPROVIDES:${PN} += "gamescope \
libVkLayer-FROG-gamescope-wsi-aarch64.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libX11-xcb.so.1 \
libX11.so.6 \
libXRes.so.1 \
libXcomposite.so.1 \
libXcursor.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libXmu.so.6 \
libXrender.so.1 \
libXtst.so.6 \
libXxf86vm.so.1 \
libavif.so.16 \
libc.so.6 \
libcap.so.2 \
libdecor-0.so.0 \
libdrm.so.2 \
libeis.so.1 \
libgcc-s.so.1 \
libinput.so.10 \
liblcms2.so.2 \
libluajit-5.1.so.2 \
libm.so.6 \
libmvec.so.1 \
libpipewire-0.3.so.0 \
libpixman-1.so.0 \
libseat.so.1 \
libstdc++.so.6 \
libudev.so.1 \
libwayland-client.so.0 \
libwayland-server.so.0 \
libxcb.so.1 \
libxkbcommon.so.0"

inherit rpm
