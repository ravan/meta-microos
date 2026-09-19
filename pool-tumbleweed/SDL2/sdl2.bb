SUMMARY = "Simple DirectMedia Layer Library"
DESCRIPTION = "This is the 'Simple DirectMedia Layer' library. It provides a generic \
API for access to audio, keyboard, mouse, and display framebuffer \
across multiple platforms. \
 \
This package is provided for corner cases when sdl2_compat is \
insufficient. To use original SDL2, exercise with the \
LD_LIBRARY_PATH='/usr/lib64/SDL2' mechanism. \
 \
SDL2 uses dlopen, so if you experience problems under X11, check \
again that libXrandr2 and libXi6 are in fact installed."
LICENSE = "Zlib"

PV = "2.32.10"

RPM_NAME = "SDL2-2.32.10-1.6.aarch64.rpm"
RPM_HASH = "9fec3ca0f93ae187df01da86759eec87d436cf162be9236493ad6d9071cb062c6f048634919c4170a486f0f5ffb0af4d4ae02201721aac75dcfe80f12517df73"

RPROVIDES:${PN} += "SDL2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6"

inherit rpm
