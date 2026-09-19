SUMMARY = "Simple DirectMedia Layer Library"
DESCRIPTION = "This is the 'Simple DirectMedia Layer' library. It provides a generic \
API for access to audio, keyboard, mouse, and display framebuffer \
across multiple platforms. \
 \
This package is provided for corner cases when sdl12_compat is insufficient \
(e.g. with the 'tcd' package). To use original SDL1, exercise \
with the LD_LIBRARY_PATH='/usr/lib64/SDL1' mechanism."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.15"

RPM_NAME = "SDL-1.2.15-1.5.aarch64.rpm"
RPM_HASH = "0f897a445ab1fea2a774a13892e20a4b7dc422a70ab3a6b85368d287997119da4aee17b02ff6b0b729b2690f87a37c6e4a9fc69e8783a18ef5c96da638b965e0"

RPROVIDES:${PN} += "SDL"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXrandr.so.2 \
libasound.so.2 \
libc.so.6 \
libm.so.6 \
libpulse-simple.so.0 \
libpulse.so.0"

inherit rpm
