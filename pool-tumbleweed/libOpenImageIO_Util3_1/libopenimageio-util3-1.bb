SUMMARY = "Library for Reading and Writing Images"
DESCRIPTION = "OpenImageIO is a library for reading and writing images, and a bunch of related \
classes, utilities, and applications. There is a particular emphasis on formats \
and functionality used in professional, large-scale animation and visual \
effects work for film. OpenImageIO is used extensively in animation and VFX \
studios all over the world, and is also incorporated into several commercial \
products."
LICENSE = "Apache-2.0"

PV = "3.1.17.0"

RPM_NAME = "libOpenImageIO_Util3_1-3.1.17.0-1.1.aarch64.rpm"
RPM_HASH = "b3d0d264e2746d63ff63ed683239950eca711803b0727e4d378c6f25d03ed4f2b7511d0245314ae31a9eddfa4db13727124cced659d122cd4aa29da827d0af57"

RPROVIDES:${PN} += "libOpenImageIO-Util.so.3.1 \
libOpenImageIO-Util3-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtbb.so.12"

inherit rpm
