SUMMARY = "Minimalist image viewer"
DESCRIPTION = "pqiv is a powerful GTK 3 based command-line image viewer with a minimal UI. It \
is highly customizable, can be fully controlled from scripts, and has support \
for various file formats including PDF, Postscript, video files and archives. \
It is optimized to be quick and responsive. \
It comes with support for animations, slideshows, transparency, VIM-like key \
bindings, automated loading of new images as they appear, external image \
filters, image preloading, and much more. \
pqiv started as a Python rewrite of qiv avoiding imlib, but evolved into a much \
more powerful tool. Today, pqiv stands for powerful quick image viewer. \
Features: \
 * Command line image viewer \
 * Directory traversing to view whole directories \
 * Watch files and directories for changes \
 * Natural order sorting of the images \
 * A status bar showing information on the current image \
 * Transparency and animation support \
 * Moving, zooming, rotation, flipping \
 * Slideshows \
 * Highly customizable and scriptable \
 * Supports external image filters (e.g. `convert`) \
 * Preloads the next image in the background \
 * Fade between images \
 * Optional PDF/eps/ps support (useful e.g. for scientific plots) \
 * Optional video format support (e.g. for webm animations)"
LICENSE = "GPL-3.0-or-later"

PV = "2.13.3"

RPM_NAME = "pqiv-2.13.3-1.4.aarch64.rpm"
RPM_HASH = "667e22ef3fe2ee444f022281c0c6f4f3dec8042b33401782f8595b27406344f51900f8ba35642ff0fbece09d9fbcf5791aa4aae6c42a86a2e837961f76b4eb40"

RPROVIDES:${PN} += "pqiv"

RDEPENDS:${PN} += "libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
