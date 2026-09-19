SUMMARY = "Persistence of Vision Raytracer"
DESCRIPTION = "The Persistence of Vision Ray tracer creates three-dimensional, \
photo-realistic images using a rendering technique called ray tracing. \
It reads in a text file containing information describing the objects \
and lighting in a scene and generates an image of that scene from the \
view point of a camera also described in the text file. Ray tracing is \
not a fast process by any means, (the generation of a complex image can \
take several hours) but it produces very high quality images with \
realistic reflections, shading, perspective, and other effects."
LICENSE = "AGPL-3.0-or-later & CC-BY-SA-3.0"

PV = "3.7.0.10"

RPM_NAME = "povray-3.7.0.10-4.12.aarch64.rpm"
RPM_HASH = "63952f66989f2d2c9d6120514dd7139abce7592e473c9d7256376313c46bb3d3ec32f76cfc91a7f915efd0fa8ade4c551ab5169d4ae025e8675fe744cdb6f57f"

RPROVIDES:${PN} += "config-povray \
povray"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libImath-3-2.so.30 \
libOpenEXR-3-4.so.33 \
libSDL-1.2.so.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1"

inherit rpm
