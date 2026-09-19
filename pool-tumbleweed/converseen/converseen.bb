SUMMARY = "Batch Image Conversion Tool"
DESCRIPTION = "Converseen is a batch image conversion tool. Converseen allows you \
to convert images in more than 100 different formats. \
 \
With converseen you can: \
- Carry out a single or a multiple conversion. \
- Resize one or more images. \
- Compress images for your web pages. \
- Rotate and flip images. \
- Rename a bunch of images using a progressive number or a prefix/suffix. \
- Selecting a resampling filter to resize images."
LICENSE = "GPL-3.0-or-later"

PV = "0.15.0.3"

RPM_NAME = "converseen-0.15.0.3-1.6.aarch64.rpm"
RPM_HASH = "04203a7e457782e3367588ca9ced3c63be1330086b20ec7627272cedeb62c5bcbc20f7cdc59c49814943fd10e15bd9acb1daca5ef13562348f8506270c9b863a"

RPROVIDES:${PN} += "converseen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMagick++-7.Q16HDRI.so.5 \
libMagickCore-7.Q16HDRI.so.10 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
