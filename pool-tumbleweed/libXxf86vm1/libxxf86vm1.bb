SUMMARY = "XFree86-VidMode X extension library"
DESCRIPTION = "These functions provide aninterface to the server extension \
XFree86-VidModeExtension which allows the video modes to be queried \
and adjusted dynamically and mode switching to be controlled."
LICENSE = "MIT"

PV = "1.1.7"

RPM_NAME = "libXxf86vm1-1.1.7-1.4.aarch64.rpm"
RPM_HASH = "081d54cee56d9f403bb65c169c275844a3b1ca5edda05a6aa963d2617d90a00db4f4fbb1ae1e8385472eb7ba1ba7e873ab9740fabb3f9b7ec630702e695b39f9"

RPROVIDES:${PN} += "libXxf86vm.so.1 \
libXxf86vm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6"

inherit rpm
