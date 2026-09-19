SUMMARY = "Cross-platform raw image processing program"
DESCRIPTION = "RawTherapee is a cross platform image processing software equipped with the essential tools for high quality and efficient RAW photo development. \
 \
 \
 \
Latest stable build from 'releases' branch."
LICENSE = "GPL-3.0-only"

PV = "5.12"

RPM_NAME = "rawtherapee-5.12-4.6.aarch64.rpm"
RPM_HASH = "664c9fd39a027cf86a75d8a64d5f692422636f527b0cf6538178a2956ee0b42adeb3fe5d6ddf26d848e67d6383104fce3a4ab3ec10b6e8238a937a68c32c78da"

RPROVIDES:${PN} += "rawtherapee"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairo.so.2 \
libcairomm-1.0.so.1 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libexiv2.so.28 \
libexpat.so.1 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdkmm-3.0.so.1 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgomp.so.1 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libjpeg.so.8 \
libjxl-threads.so.0.11 \
libjxl.so.0.11 \
liblcms2.so.2 \
liblensfun.so.1 \
libm.so.6 \
libpangomm-1.4.so.1 \
libpng16.so.16 \
libraw-r.so.25 \
librsvg-2.so.2 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
libtcmalloc.so.4 \
libtiff.so.6 \
libz.so.1"

inherit rpm
