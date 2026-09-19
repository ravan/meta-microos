SUMMARY = "Hyprland graphics / resource utilities"
DESCRIPTION = "Hyprgraphics is a small C++ library with graphics / resource related \
utilities used across the hypr* ecosystem."
LICENSE = "BSD-3-Clause"

PV = "0.5.1"

RPM_NAME = "libhyprgraphics4-0.5.1-1.5.aarch64.rpm"
RPM_HASH = "964c71e33d44019c2a5db7b5b4c02fde2a944267a57c60dbf92eb70554cd0c351838d0492c6882b24f05c9ca79cfdda9302fa6fb19ea1d6eb1690eef91ce3865"

RPROVIDES:${PN} += "libhyprgraphics.so.4 \
libhyprgraphics4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libhyprutils.so.13 \
libjpeg.so.8 \
libjxl-threads.so.0.11 \
libjxl.so.0.11 \
libm.so.6 \
libmagic.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
librsvg-2.so.2 \
libstdc++.so.6 \
libwebp.so.7"

inherit rpm
