SUMMARY = "Screen Locker for the i3 Window Manager"
DESCRIPTION = "i3lock is a simple screen locker like slock. After starting it, you will see a \
white screen (you can configure the color/an image). You can return to your \
screen by entering your password."
LICENSE = "BSD-3-Clause"

PV = "2.16"

RPM_NAME = "i3lock-2.16-1.5.aarch64.rpm"
RPM_HASH = "f0ef2712b91b237462695d173e0f6181f4780d1f6653be277770c8e4b9f788cab3a6a2f551a6b9982551888c054e524e946c32264bb4dc912f0900355ae2e530"

RPROVIDES:${PN} += "i3lock"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libev.so.4 \
libpam.so.0 \
libxcb-image.so.0 \
libxcb-randr.so.0 \
libxcb-util.so.1 \
libxcb-xinerama.so.0 \
libxcb-xkb.so.1 \
libxcb-xrm.so.0 \
libxcb.so.1 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0"

inherit rpm
