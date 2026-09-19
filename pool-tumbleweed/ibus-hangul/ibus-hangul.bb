SUMMARY = "The Hangul engine for IBus input platform"
DESCRIPTION = "The Hangul engine for IBus platform. It provides Korean input method from \
libhangul."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.5"

RPM_NAME = "ibus-hangul-1.5.5-3.6.aarch64.rpm"
RPM_HASH = "06af7a52b0552c5c7743ef9d2740080d410e19b236fd78a769adce525933d530a20a29dab291621c53e96a44bd65e4eaf44e24b174c9b66ea7402ceb3906e852"

RPROVIDES:${PN} += "ibus-hangul \
locale-ibus-ko"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libhangul.so.1 \
libibus-1.0.so.5 \
python3-gobject \
scalable-font-ko"

inherit rpm
