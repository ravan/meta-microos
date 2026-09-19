SUMMARY = "GLX backend for the Video Acceleration API"
DESCRIPTION = "The libva library implements the Video Acceleration API. \
The library loads a hardware dependendent driver. \
 \
This is the VA/GLX runtime library."
LICENSE = "MIT"

PV = "2.24.1"

RPM_NAME = "libva-glx2-2.24.1-1.1.aarch64.rpm"
RPM_HASH = "4cb07a2bb01af918f81a0cbae5cfcc17a6dc6deab37c2c04b638e260a353cefa031794beef23860e4f5f6502f29194039da54aa0496f967a2aeca830d58c96a5"

RPROVIDES:${PN} += "libva-glx.so.2 \
libva-glx2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libc.so.6 \
libva-x11.so.2 \
libva.so.2"

inherit rpm
