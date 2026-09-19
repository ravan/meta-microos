SUMMARY = "Caja image converter"
DESCRIPTION = "ImageResizer adds a 'Resize Images...' menu item to the context \
menu of all images. This opens a dialog where you set the desired \
image size and file name. A click on 'Resize' finally resizes the \
image(s) using ImageMagick's convert tool."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "caja-extension-image-converter-1.28.0-2.11.aarch64.rpm"
RPM_HASH = "9cfd58458fdc32ad5f1292587a691792b47bbda38c2c8facb4711285d26c71b107160888269f7ccd1b1648f16db932ec035d084e47650665f26d0b90afe84427"

RPROVIDES:${PN} += "caja-extension-image-converter \
caja-image-converter \
libcaja-image-converter.so \
mate-file-manager-image-converter"

RDEPENDS:${PN} += "ImageMagick \
caja \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcaja-extension.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
