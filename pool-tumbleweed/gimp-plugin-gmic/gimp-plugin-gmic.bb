SUMMARY = "GMIC plugin for gimp"
DESCRIPTION = "This is a plugin for gimp that exposes many of the nice gmic features \
for interactive use in gimp."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.3"

RPM_NAME = "gimp-plugin-gmic-4.0.3-1.2.aarch64.rpm"
RPM_HASH = "157ba62ad090acf7ecf8627aecd296ad5007268c37ce6183f4f8c3bbc2bde0951d07eed1a4a189f0c0b08570b5452fdf2f4aebf0a2d591b4ddc93d8a29d0bd9f"

RPROVIDES:${PN} += "gimp-plugin-gmic \
gmic-gimp"

RDEPENDS:${PN} += "gimp \
gmic-data \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libbabl-0.1.so.0 \
libc.so.6 \
libfftw3-threads.so.3 \
libgcc-s.so.1 \
libgegl-0.4.so.0 \
libgimp-3.0.so.0 \
libgimpbase-3.0.so.0 \
libglib-2.0.so.0 \
libgmic.so.4 \
libgobject-2.0.so.0 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
