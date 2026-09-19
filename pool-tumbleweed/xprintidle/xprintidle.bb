SUMMARY = "Utility to print user's idle time in X"
DESCRIPTION = "An utility that queries the X server for the user's idle time and \
prints it to stdout (in milliseconds)."
LICENSE = "GPL-2.0-only"

PV = "0.3.0"

RPM_NAME = "xprintidle-0.3.0-1.5.aarch64.rpm"
RPM_HASH = "c4ec60e37a10138aa59be5b3db6c2cf898707023b6d38e26b4d55b494817b9376828f134e1c21027916e6e74f8d899e8f92e06638b985db03ec1b746eb2b6d3d"

RPROVIDES:${PN} += "xprintidle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXss.so.1 \
libc.so.6"

inherit rpm
