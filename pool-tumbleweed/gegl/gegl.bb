SUMMARY = "Generic Graphics Library"
DESCRIPTION = "GEGL provides infrastructure to do demand based cached non destructive \
image editing on larger than RAM buffers. Through babl, it provides \
support for a wide range of color models and pixel storage formats for \
input and output."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.4.72"

RPM_NAME = "gegl-0.4.72-1.1.aarch64.rpm"
RPM_HASH = "ffd4ef3d690095cd926e42713f9de3379c91ec77082db9b9ca37b93283b4d7870a5e82e67882ec410ccb1b8bcbde3ede5997fb6ec7f87e946a15dcd6e99fff9e"

RPROVIDES:${PN} += "gegl \
gegl-0-3-orig-addon \
gegl-unstable"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbabl-0.1.so.0 \
libc.so.6 \
libgegl-0.4.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libspiro.so.1"

inherit rpm
