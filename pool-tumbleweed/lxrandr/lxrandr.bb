SUMMARY = "Lightweight Monitor Config Tool"
DESCRIPTION = "LXRandR is a lightweight Monitor Config Tool"
LICENSE = "GPL-2.0-only"

PV = "0.3.2"

RPM_NAME = "lxrandr-0.3.2-1.27.aarch64.rpm"
RPM_HASH = "a3621697327d1d17135bab039cea7d9f192cf19a64f1e7aecd66519bc17880b28b7a1a25bd632242437f20c643fe9a036b32b2afbfc35ac7e49aa67e33edeb4a"

RPROVIDES:${PN} += "lxrandr"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
