SUMMARY = "The GNU Image Manipulation Program - UI Libraries"
DESCRIPTION = "The GIMP is an image composition and editing program. GIMP offers \
many tools and filters, and provides a large image manipulation \
toolbox and scripting. \
 \
This package provides GIMP UI libraries."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.6"

RPM_NAME = "libgimpui-3_0-0-3.2.6-1.1.aarch64.rpm"
RPM_HASH = "9802dc7286c8f3b8d0257c2eb4518e53e2744c2597ce09bd11ba0dcd4a6c22a32c3f90414e86cd81503ad92727f57995b1eef182abb80373028d5a3c37e1a69d"

RPROVIDES:${PN} += "libgimpthumb-3.0.so.0 \
libgimpui-3-0-0 \
libgimpui-3.0.so.0 \
libgimpwidgets-3.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbabl-0.1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgegl-0.4.so.0 \
libgimp-3.0.so.0 \
libgimpbase-3.0.so.0 \
libgimpcolor-3.0.so.0 \
libgimpconfig-3.0.so.0 \
libgimpmodule-3.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
liblcms2.so.2 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
