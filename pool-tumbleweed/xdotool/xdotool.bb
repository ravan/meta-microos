SUMMARY = "Fake keyboard/mouse input"
DESCRIPTION = "This tool lets you programatically (or manually) simulate keyboard input and \
mouse activity, move and resize windows, etc. It does this using X11's XTEST \
extension and other Xlib functions."
LICENSE = "BSD-3-Clause"

PV = "4.20251130.1"

RPM_NAME = "xdotool-4.20251130.1-1.4.aarch64.rpm"
RPM_HASH = "4668deca4fa03509f429d17832278013fff8130b0e9a645d9e647bc77a73a0102c7378e9041fe33700903c6fde015d5d65e094785033c3e430fd606df1cb400d"

RPROVIDES:${PN} += "libxdo.so.4 \
xdotool"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXinerama.so.1 \
libXtst.so.6 \
libc.so.6 \
libm.so.6 \
libxkbcommon.so.0"

inherit rpm
