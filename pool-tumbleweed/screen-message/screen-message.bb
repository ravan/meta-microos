SUMMARY = "Program to display a short text fullscreen"
DESCRIPTION = "Screen Message is a program to display a text as large as possible on \
the screen. The text can be edited while Screen Message is running."
LICENSE = "GPL-2.0-or-later"

PV = "0.28"

RPM_NAME = "screen-message-0.28-2.11.aarch64.rpm"
RPM_HASH = "baa31c1c24484c5ffcd6152b81c6c66121c685bc4ecdbc458fe093e366d0854474b1700a43aeb29d884d6f2bb5ce335c90be2ee1d07a2f878a7a7b5f07bf7081"

RPROVIDES:${PN} += "screen-message"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
