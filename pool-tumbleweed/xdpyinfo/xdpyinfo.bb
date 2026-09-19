SUMMARY = "Utility to display information about an X server"
DESCRIPTION = "xdpyinfo is a utility for displaying information about an X server. \
 \
It is used to examine the capabilities of a server, the predefined \
values for various parameters used in communicating between clients \
and the server, and the different types of screens, visuals, and X11 \
protocol extensions that are available."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "xdpyinfo-1.4.0-1.5.aarch64.rpm"
RPM_HASH = "b8fbe8d15f41e569d300b3e54f64f56b043707a334b60ecb73f5b8b1167465b1ff1f10b6db6b9b6c7fded3b50df74d1b3c20355df73318220e30f4c3f1a09d33"

RPROVIDES:${PN} += "xdpyinfo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libXcomposite.so.1 \
libXext.so.6 \
libXi.so.6 \
libXinerama.so.1 \
libXrender.so.1 \
libXtst.so.6 \
libXxf86dga.so.1 \
libXxf86vm.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
