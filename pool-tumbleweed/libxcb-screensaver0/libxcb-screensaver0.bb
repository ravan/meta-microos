SUMMARY = "X11 ScreenSaver Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
The X Window System provides support for changing the image on a \
display screen after a user-settable period of inactivity to avoid \
burning the cathode ray tube phosphors. This extension allows an \
external 'screen saver' client to detect when the alternate image is \
to be displayed and to provide the graphics."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "libxcb-screensaver0-1.17.0-2.7.aarch64.rpm"
RPM_HASH = "0c35a0675821fb20d9a55e291f27d69ec88a410a764baa118aa8ed8d2fcb7a5b2b10bc8da63791682d794126399da8032189b024c7938bb3a07081cfbc1cb254"

RPROVIDES:${PN} += "libxcb-screensaver.so.0 \
libxcb-screensaver0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
