SUMMARY = "Creating and editing GIF images and animations"
DESCRIPTION = "Gifsicle manipulates GIF image files on the \
command line. It supports merging several GIFs \
into a GIF animation; exploding an animation into \
its component frames; changing individual frames \
in an animation; turning interlacing on and off; \
adding transparency; adding delays, disposals, and \
looping to animations; adding or removing \
comments; optimizing animations for space; and \
changing images' colormaps, among other things. \
 \
The gifsicle package contains two other programs: \
gifview, a lightweight GIF viewer for X, can show \
animations as slideshows or in real time, and \
gifdiff compares two GIFs for identical visual \
appearance."
LICENSE = "GPL-2.0-only"

PV = "1.96"

RPM_NAME = "gifsicle-1.96-1.8.aarch64.rpm"
RPM_HASH = "3edf142daa94160380e067b9259b4f2af8425f52bc9eacea3d0eb2e4455c63562f0ec009aa26730e42ea71cf15f6bc8b7f18b48e4cd7bda73bfd2c9453b15c08"

RPROVIDES:${PN} += "gifsicle \
ungifsicle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
