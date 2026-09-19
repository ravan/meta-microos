SUMMARY = "Tiny 2D vector graphics library in C"
DESCRIPTION = "PlutoVG is a standalone 2D vector graphics library in C. \
 \
Features: \
* Path Filling, Stroking and Dashing \
* Soild, Gradient and Texture Paints \
* Fonts and Texts \
* Clipping and Compositing \
* Transformations \
* Images"
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "libplutovg1-1.3.2-1.3.aarch64.rpm"
RPM_HASH = "e0239d6b41e31a4ef07d6f9e599d4824cdeef314362d8e1f4f9ce38115127d23fef074a77f1408434c72e951f9121a4d89622d0d5b0bd1cfb574c2b4d7e50e06"

RPROVIDES:${PN} += "libplutovg.so.1 \
libplutovg1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libm.so.6"

inherit rpm
