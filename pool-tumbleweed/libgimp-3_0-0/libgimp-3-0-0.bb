SUMMARY = "The GNU Image Manipulation Program - Libraries"
DESCRIPTION = "The GIMP is an image composition and editing program. GIMP offers \
many tools and filters, and provides a large image manipulation \
toolbox and scripting. \
 \
This package provides GIMP libraries."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.6"

RPM_NAME = "libgimp-3_0-0-3.2.6-1.1.aarch64.rpm"
RPM_HASH = "db50432660a45a9557e029297f3ab06ccdce8f6a21c95d6859378d4075b30a47cd3bced88b12b694c02f0023dfd6f4064cbcdaa8c7df6d038850197cca72618c"

RPROVIDES:${PN} += "libgimp-3-0-0 \
libgimp-3.0.so.0 \
libgimp-scriptfu-3.0.so.0 \
libgimpbase-3.0.so.0 \
libgimpcolor-3.0.so.0 \
libgimpconfig-3.0.so.0 \
libgimpmath-3.0.so.0 \
libgimpmodule-3.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbabl-0-1-0 \
libbabl-0.1.so.0 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgegl-0-4-0 \
libgegl-0.4.so.0 \
libgexiv2-2 \
libgexiv2.so.2 \
libgimpui-3.0.so.0 \
libgimpwidgets-3.0.so.0 \
libgio-2.0.so.0 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
liblcms2.so.2 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
