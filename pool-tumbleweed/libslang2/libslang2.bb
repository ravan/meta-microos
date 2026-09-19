SUMMARY = "Programming Library and Embeddable Extension Language"
DESCRIPTION = "S-Lang is a programming library for creating multi-platform software. \
It provides display/screen management, keyboard input, keymaps, etc. \
Another feature is the interpreter for the S-Lang extension language \
which can be embedded into an application to make it extensible. With \
slsh, a standalone interpreter is available as well."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.3+git16.89d32bb"

RPM_NAME = "libslang2-2.3.3+git16.89d32bb-2.7.aarch64.rpm"
RPM_HASH = "ba665523470a2f9a80da632b1bd4055050926e0a469711596b2ec3f8f6bc61c66434ee62ee546c6abbf347fd855098644fbe0acd5ee94d0d203a8d3c1cda0476"

RPROVIDES:${PN} += "libslang.so.2 \
libslang2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
