SUMMARY = "Selection of screensavers from xscreensaver"
DESCRIPTION = "The xscreensaver program waits until the keyboard and mouse have \
been idle for a period of time, and then runs a graphics demo \
chosen at random. It turns off as soon as there is any mouse or \
keyboard activity. It can also lock the screen immediately, after a \
longer idle period, or on demand. \
 \
This packages contains a selection of graphics demos."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "6.15"

RPM_NAME = "xscreensaver-data-6.15-3.3.aarch64.rpm"
RPM_HASH = "5c3626c9600fe7564d0f94ef87250ceaa34c14b567925e00af8cec06c3df2901eadf57d48844c81ac667d3bbbaae6b5ec4a5a6a6ac49150e27c876103dfa2cc8"

RPROVIDES:${PN} += "config-xscreensaver-data \
xscreensaver-data"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libGLU.so.1 \
libX11.so.6 \
libXext.so.6 \
libXft.so.2 \
libXt.so.6 \
libc.so.6 \
libfontconfig.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6"

inherit rpm
