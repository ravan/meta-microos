SUMMARY = "SDL plugin for xine"
DESCRIPTION = "SDL xine video output plugin \
 \
 \
 \
Authors: \
-------- \
    Guenter Bartsch <guenter@users.sourceforge.net>"
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain"

PV = "1.2.13"

RPM_NAME = "libxine2-sdl-1.2.13-11.5.aarch64.rpm"
RPM_HASH = "63dcabf3292805c4b5f93b43b13c51db83cdcf6acb433b25cf366959482fa2c2bd627c5da55979a9e1ff654919d557bea4185157b702bb82b6c34da85c3bc862"

RPROVIDES:${PN} += "libxine2-sdl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libX11.so.6 \
libc.so.6 \
libxine.so.2 \
libxine2"

inherit rpm
