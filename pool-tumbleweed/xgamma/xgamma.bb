SUMMARY = "Utility to alter a monitor's gamma correction through the X server"
DESCRIPTION = "xgamma allows X users to query and alter the gamma correction of a \
monitor via the X video mode extension (XFree86-VidModeExtension)."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "xgamma-1.0.8-1.4.aarch64.rpm"
RPM_HASH = "001f66e434bc03d4c9d704ec4cdfddc03e7db8080205e7b660d8030f9bccc1fee38803e7918cb5c57bf5137b18f4a12a379fe3f8ecbc66bf41acf69d9b8f86a1"

RPROVIDES:${PN} += "xgamma"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXxf86vm.so.1 \
libc.so.6"

inherit rpm
