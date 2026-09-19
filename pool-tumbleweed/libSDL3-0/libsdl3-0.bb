SUMMARY = "Simple DirectMedia Layer Library"
DESCRIPTION = "Simple DirectMedia Layer (SDL) is a cross-platform library for \
multi-media software, such as games and emulators. It provides a \
generic API for access to audio, keyboard, mouse, and display \
framebuffer. \
 \
SDL uses dlopen, so if you experience problems under X11, check \
again that libXrandr2 and libXi6 are in fact installed."
LICENSE = "Zlib"

PV = "3.4.16"

RPM_NAME = "libSDL3-0-3.4.16-1.1.aarch64.rpm"
RPM_HASH = "a2cbdd9ae7b66cebc49d97be4c65d4170f446fe4f442a27ac4ed96b61a75de3beae1f11714ea28b1a183a807fe8189ebd5926e6ce042fabf90354a0703df43d0"

RPROVIDES:${PN} += "libSDL3-0 \
libSDL3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcursor.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libXrandr.so.2 \
libXss.so.1 \
libXtst.so.6 \
libasound.so.2 \
libc.so.6 \
libdecor-0.so.0 \
libdrm.so.2 \
libgbm.so.1 \
libm.so.6 \
libpipewire-0.3.so.0 \
libpulse.so.0 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libwayland-egl.so.1 \
libxkbcommon.so.0"

inherit rpm
