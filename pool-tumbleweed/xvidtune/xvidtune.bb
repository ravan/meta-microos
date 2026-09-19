SUMMARY = "Video mode tuner for the X server"
DESCRIPTION = "xvidtune is a client interface to the X server video mode \
extension (XFree86-VidModeExtension)."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "xvidtune-1.0.4-1.13.aarch64.rpm"
RPM_HASH = "43b35bb7fb9640d85d2fab21048f9e08c8348f0164294b12194b99cc805cbeb02f647f6b632e49f6ace97ab0784863155d86058591d834dcdae0924bbb108835"

RPROVIDES:${PN} += "xvidtune"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libXxf86vm.so.1 \
libc.so.6"

inherit rpm
