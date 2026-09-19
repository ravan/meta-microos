SUMMARY = "Linux 平台下基于 Rust + GTK4 开发的网易云音乐播放器"
DESCRIPTION = "netease-cloud-music-gtk 是基于 Rust + GTK4 开发的网易云音乐播放器，专为 Linux 系统打造。"
LICENSE = "GPL-3.0-or-later"

PV = "2.5.4"

RPM_NAME = "netease-cloud-music-gtk-2.5.4-1.2.aarch64.rpm"
RPM_HASH = "29bb41cc170bb2e85c7f74c7f7b64d64df7c3f46a69d95f39719dcf1a10c244fb6dfc29f4807ac9db64a7f7c3bedda719bd2ef998238ba393562abd06e604ac7"

RPROVIDES:${PN} += "netease-cloud-music-gtk"

RDEPENDS:${PN} += "gstreamer \
gstreamer-plugins-bad \
gstreamer-plugins-base \
gstreamer-plugins-good \
gstreamer-plugins-ugly \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libcrypto.so.3 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgstplay-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0 \
libssl.so.3 \
libz.so.1 \
openssl"

inherit rpm
