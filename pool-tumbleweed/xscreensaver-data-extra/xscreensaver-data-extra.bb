SUMMARY = "Selection of screensavers from xscreensaver"
DESCRIPTION = "The xscreensaver program waits until the keyboard and mouse have \
been idle for a period of time, and then runs a graphics demo \
chosen at random. It turns off as soon as there is any mouse or \
keyboard activity. It can also lock the screen immediately, after a \
longer idle period, or on demand. \
 \
This packages contains additional graphics demos."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "6.15"

RPM_NAME = "xscreensaver-data-extra-6.15-3.3.aarch64.rpm"
RPM_HASH = "30c9614aaf1caea7bbc24792d028653c7a1e5a1db19c6b6dad723ab8a81349b71f20b831e101b53de530d9681cbec4bcf7e5e6fdc82b472368bdd21c67aa9c76"

RPROVIDES:${PN} += "config-xscreensaver-data-extra \
xscreensaver-data-extra"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
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
libgle.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
libm.so.6"

inherit rpm
