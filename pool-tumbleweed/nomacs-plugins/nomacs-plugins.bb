SUMMARY = "Plugins for nomacs image viewer"
DESCRIPTION = "Some usefull plugins for nomacs: \
- Affine transformations \
- RGB image from greyscales \
- Fake miniature filter \
- Page extractions \
- Painting"
LICENSE = "GPL-3.0-or-later"

PV = "3.23.3"

RPM_NAME = "nomacs-plugins-3.23.3-1.1.aarch64.rpm"
RPM_HASH = "50bf6fbe13049542aa133aa6996c673ba74786eab2f923c8d8637a705bc1b4833ac172eede89760918a560d740a0d45af400102056b8bb7cd2b30dfe43393c01"

RPROVIDES:${PN} += "libCompositePlugin.so.3 \
libaffineTransformPlugin.so.3 \
libfakeMiniaturesPlugin.so.3 \
libpageExtractionPlugin.so.3 \
libpaintPlugin.so.3 \
nomacs-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libnomacsCore.so.3 \
libopencv-core.so.413 \
libopencv-imgproc.so.413 \
libstdc++.so.6 \
nomacs"

inherit rpm
