SUMMARY = "An Image Viewer"
DESCRIPTION = "Viewnior is an image viewer program with a minimal interface. \
Its features are: \
 \
* Fullscreen & Slideshow \
* Rotate, flip, save, delete images \
* Animation support \
* Browse only selected images \
* Navigation window \
* Simple interface \
* Configurable mouse actions"
LICENSE = "GPL-3.0-or-later"

PV = "1.8"

RPM_NAME = "viewnior-1.8-2.13.aarch64.rpm"
RPM_HASH = "d48edfec11ff495253eaa9a3c31d1c0079d36794040a33d6721cbce099c4ef6b24ef73fd5bb07630252018ade0f0ad056ed569da31e0ccd65678fc207d369bf5"

RPROVIDES:${PN} += "viewnior"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexiv2.so.28 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
