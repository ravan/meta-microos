SUMMARY = "Screen region selection library"
DESCRIPTION = "This library implements the slop utility's functionality to mark a \
region ont the screen."
LICENSE = "GPL-3.0-or-later"

PV = "7.7"

RPM_NAME = "libslopy7_7-7.7-1.6.aarch64.rpm"
RPM_HASH = "e54d1452663f07a7c6a46db34b8f802304c831aa7507cd67992cbf3acd7152e5868f98d1c8bf4eece6e959fc68fcf5fca1867917dbcb1602d6343ca3a129d4f0"

RPROVIDES:${PN} += "libslopy.so.7.7 \
libslopy7-7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGLEW.so.2.3 \
libGLX.so.0 \
libOpenGL.so.0 \
libX11.so.6 \
libXext.so.6 \
libXrender.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
