SUMMARY = "A multimedia sketchpad"
DESCRIPTION = "Decker is a multimedia platform for creating and sharing interactive documents, with sound, images, hypertext, and scripted behavior."
LICENSE = "MIT"

PV = "1.60"

RPM_NAME = "decker-1.60-1.5.aarch64.rpm"
RPM_HASH = "d702f95ce219bb6094fe199683a3842144e6e6379231ffdc69a6bbb091daa66f83211a61a84f82768091c41bc707055fc8f8db318cef9bcc85b85797bc90716f"

RPROVIDES:${PN} += "decker"

RDEPENDS:${PN} += "libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
