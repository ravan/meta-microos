SUMMARY = "Library for Reading and Writing Images"
DESCRIPTION = "OpenImageIO is a library for reading and writing images, and a bunch of related \
classes, utilities, and applications. There is a particular emphasis on formats \
and functionality used in professional, large-scale animation and visual \
effects work for film. OpenImageIO is used extensively in animation and VFX \
studios all over the world, and is also incorporated into several commercial \
products."
LICENSE = "Apache-2.0"

PV = "3.1.17.0"

RPM_NAME = "OpenImageIO-3.1.17.0-1.1.aarch64.rpm"
RPM_HASH = "348f75400f98e572dc5194d7affb997f0fe8516374293928e02ad4644bb73915ddc379313edc1d0051ca622fe4392ed6eae5e44702810134fd9843e50cc50cab"

RPROVIDES:${PN} += "OpenImageIO"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenEXR-3-4.so.33 \
libOpenImageIO-Util.so.3.1 \
libOpenImageIO.so.3.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-core.so.413 \
libopencv-stitching.so.413 \
libopencv-videoio.so.413 \
libstdc++.so.6"

inherit rpm
