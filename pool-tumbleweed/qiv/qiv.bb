SUMMARY = "A gdk/imlib based image viewer"
DESCRIPTION = "The 'Quick Image Viewer' (qiv) is a GDK/Imlib image viewer similar to \
viewers like xv or xloadimage. qiv features setting an image as an \
x11 background with a user-definable background color, fullscreen \
viewing, a screensaver mode, brightness/contrast/gamma correction, \
real transparency, zoom and slideshow. \
 \
It creates only one window, containing only the image to view."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.4"

RPM_NAME = "qiv-2.3.4-1.5.aarch64.rpm"
RPM_HASH = "a112b315e6ab839b36ece9bfdae9d4cd54c426450b9cf3a5b50357ca9ddf76d2b21fe740ff0e8d0d928a66e280491c3c15ff291a3a16044914de0b74aa2b25df"

RPROVIDES:${PN} += "qiv"

RDEPENDS:${PN} += "imlib2-loaders \
libImlib2.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6 \
libcairo.so.2 \
libexif.so.12 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
liblcms2.so.2 \
libmagic.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libtiff.so.6"

inherit rpm
