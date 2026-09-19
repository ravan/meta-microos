SUMMARY = "Drawing Program for Young Children"
DESCRIPTION = "Tux Paint' is a drawing program for young children. It has a simple \
interface and fixed canvas size, and provides access to previous images \
using a thumbnail browser (it provides no access to the underlying \
filesystem). \
 \
Unlike drawing programs such as 'The GIMP', it has a very \
limited toolset. However, it provides a much simpler interface, and has \
entertaining, child-oriented additions such as sound effects."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.35"

RPM_NAME = "tuxpaint-0.9.35-2.2.aarch64.rpm"
RPM_HASH = "f89ba7e9415d2948a1cd224620488764125dec4bf558f92f6e51e00a08e947bca79288eeebb758e682006f1caa014f5aff07ec1c6cae747bb9302e767b0b0a88"

RPROVIDES:${PN} += "config-tuxpaint \
tuxpaint"

RDEPENDS:${PN} += "/usr/bin/bash \
gnu-free-fonts \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-Pango.so.4 \
libSDL2-gfx-1.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfribidi.so.0 \
libgobject-2.0.so.0 \
libimagequant.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpaper.so.2 \
libpng16.so.16 \
librsvg-2.so.2 \
libxml2.so.16 \
libz.so.1 \
netpbm"

inherit rpm
