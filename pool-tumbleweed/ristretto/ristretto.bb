SUMMARY = "Image viewer for the Xfce Desktop Environment"
DESCRIPTION = "The Ristretto Image Viewer is an application that can be used to \
view, and scroll through images. \
 \
It can be used to run a slideshow of images, open images with other \
applications like an image editor or configure an image as the \
desktop wallpaper."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.0"

RPM_NAME = "ristretto-0.14.0-1.3.aarch64.rpm"
RPM_HASH = "9168b55cf30fd9bb04ade547be2b4921bdee68e621e135db0fd95f0ac3941c0173b2bd1ee06a0d35520fefe1df581904823a55f9a17ab1c57ce8bea58d1659dd"

RPROVIDES:${PN} += "ristretto"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libexif.so.12 \
libexo-2.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libmagic.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3"

inherit rpm
