SUMMARY = "Generic Graphics Library"
DESCRIPTION = "GEGL provides infrastructure to do demand based cached non destructive \
image editing on larger than RAM buffers. Through babl, it provides \
support for a wide range of color models and pixel storage formats for \
input and output."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.4.72"

RPM_NAME = "libgegl-0_4-0-0.4.72-1.1.aarch64.rpm"
RPM_HASH = "3b6171d77cc1501261138e174899a5c47b6d32f395a142a5cc58957b2fbccb0e990f32cf0f832264a4776b9096492987dd218d6b014554e679a4d7a86c0a1254"

RPROVIDES:${PN} += "libgegl-0-4-0 \
libgegl-0.4.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gegl-0-4 \
ld-linux-aarch64.so.1 \
libbabl-0.1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6"

inherit rpm
