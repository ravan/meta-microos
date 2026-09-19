SUMMARY = "Fullscreen gesture recognition for X"
DESCRIPTION = "xstroke is a full-screen gesture recognition program for the X Window \
System. It captures gestures performed with a pointer device, (such as \
a mouse, a stylus, or a pen/tablet), recognizes the gestures and \
performs actions based on the gestures."
LICENSE = "GPL-2.0-or-later"

PV = "0.6"

RPM_NAME = "xstroke-0.6-253.14.aarch64.rpm"
RPM_HASH = "a575c7c57a3ac8159347f4ff8d89e3715a113903eb89f36a9dac424cb077bc3326a56f73d05140d3482f41ae395ccbb04ba7ef5e859bf4bfd8bf2dc828085bb3"

RPROVIDES:${PN} += "config-xstroke \
xstroke"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXft.so.2 \
libXpm.so.4 \
libXrender.so.1 \
libXtst.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
