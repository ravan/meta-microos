SUMMARY = "Rawtherapee fork with masks and simplified UI"
DESCRIPTION = "A free, open-source, cross-platform raw image processing program. ART is a derivative of the popular RawTherapee, trading a bit of customization and control over various processing parameters for a simpler and (hopefully) easier to use interface, while still maintaining the power and quality of RawTherapee."
LICENSE = "GPL-3.0-only"

PV = "1.26.8"

RPM_NAME = "ART-1.26.8-1.1.aarch64.rpm"
RPM_HASH = "cce696199c07f114ff4c411ad8f2cb4790d77be8b19d29d3ee17f20d7969babddb3837ac7e5b63b7280f3cc6954b16061d870ba50c0cf7f5c6ef51a8bc92112a"

RPROVIDES:${PN} += "ART \
librtengine.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libIlmCtl.so.1.5 \
libIlmCtlSimd.so.1.5 \
libOpenColorIO.so.2.5 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
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
liblcms2.so.2 \
liblensfun.so.1 \
libm.so.6 \
libmimalloc.so.3 \
libpangomm-1.4.so.1 \
libpng16.so.16 \
libraw-r.so.25 \
librsvg-2.so.2 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1"

inherit rpm
