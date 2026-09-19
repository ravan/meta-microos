SUMMARY = "Unicode text editor"
DESCRIPTION = "yudit is a unicode package to edit and convert text of different \
languages."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.7"

RPM_NAME = "yudit-3.0.7-2.12.aarch64.rpm"
RPM_HASH = "802734ec673f26dd1e401b1c42fbedfffb9c33966f388b9b81297d2c4fa47143a24d9572e90da03dfd29c57479a25cc6e633afb8e00433ec1f4f92f52222308f"

RPROVIDES:${PN} += "config-yudit \
yudit"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
perl"

inherit rpm
