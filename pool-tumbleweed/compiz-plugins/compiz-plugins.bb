SUMMARY = "OpenGL window and compositing manager default plugins"
DESCRIPTION = "This package contains the default Compiz compositing manager \
plugins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "0.8.18"

RPM_NAME = "compiz-plugins-0.8.18-4.5.aarch64.rpm"
RPM_HASH = "4537981ff3089131beeb1798689f1842a5d5f41a5893dbf20718aea55674ab7ed6326d4237dea037ee8d773fa33e16ddd3bc1369da5f0da50ceb76aff6727364"

RPROVIDES:${PN} += "compiz-plugins \
libannotate.so \
libblur.so \
libclone.so \
libcommands.so \
libcube.so \
libdbus.so \
libdecoration.so \
libfade.so \
libfs.so \
libglib.so \
libini.so \
libinotify.so \
libmatecompat.so \
libminimize.so \
libmove.so \
libobs.so \
libplace.so \
libpng.so \
libregex.so \
libresize.so \
librotate.so \
libscale.so \
libscreenshot.so \
libsvg.so \
libswitcher.so \
libwall.so \
libwater.so \
libwobbly.so \
libzoom.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLU.so.1 \
libX11.so.6 \
libXrender.so.1 \
libc.so.6 \
libcairo.so.2 \
libdbus-1.so.3 \
libdecoration.so.0 \
libfuse.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libpng16.so.16 \
librsvg-2.so.2 \
libxml2.so.16"

inherit rpm
