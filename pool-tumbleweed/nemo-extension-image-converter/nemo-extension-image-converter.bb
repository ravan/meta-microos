SUMMARY = "Nemo extension to mass resize or rotate images"
DESCRIPTION = "This package adds a 'Resize Images...' menu item to the context \
menu of all images. This opens a dialog where you set the desired \
image size and file name. A click on 'Resize' finally resizes the \
image(s) using ImageMagick's convert tool."
LICENSE = "GPL-2.0-or-later"

PV = "6.4.0"

RPM_NAME = "nemo-extension-image-converter-6.4.0-6.4.aarch64.rpm"
RPM_HASH = "1fdcc5b25377f8bf25ce1c612b830c8c99ddddfb343d6d183d28eb3fd7b6779192b188c768500d732ca2b5eaa4d1d91503425a8225588e810203726afcea5b2a"

RPROVIDES:${PN} += "libnemo-image-converter.so \
nemo-extension-image-converter \
nemo-image-converter"

RDEPENDS:${PN} += "/sbin/ldconfig \
ImageMagick \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnemo-extension.so.1 \
nemo"

inherit rpm
