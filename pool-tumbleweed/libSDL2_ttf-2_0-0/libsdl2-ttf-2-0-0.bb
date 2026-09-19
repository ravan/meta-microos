SUMMARY = "Simple DirectMedia Layer 2 Truetype library"
DESCRIPTION = "This is a sample library that allows you to use TrueType fonts in your \
SDL applications."
LICENSE = "Zlib"

PV = "2.24.0"

RPM_NAME = "libSDL2_ttf-2_0-0-2.24.0-4.5.aarch64.rpm"
RPM_HASH = "2dda3b27fdd64574805e6e52944487e7ef12c96420b045045af4e6c7ba69b6348a0aa7277b7ee11f8b942597230cf8365fbaccd9c5b9f96ce3a0c21615ee2769"

RPROVIDES:${PN} += "SDL2-ttf \
libSDL2-ttf-2-0-0 \
libSDL2-ttf-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
