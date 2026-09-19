SUMMARY = "A light video player with hardware acceleration support"
DESCRIPTION = "Minimalistic video player using GTK4 and GStreamer. The main purpose is \
to make playing hw accelerated videos with hantro and OpenGL simple."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "livi-0.5.0-1.2.aarch64.rpm"
RPM_HASH = "21c10f348dcf4e01535f9382698e498a10d9a46721f274e1ca1b4134614803a7f0b42345b401b5da2e98a07b598aab662201029e21b8e0e89666d661e8a70d49"

RPROVIDES:${PN} += "livi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgstallocators-1.0.so.0 \
libgstgl-1.0.so.0 \
libgstplay-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-4.so.1 \
libwayland-client.so.0"

inherit rpm
