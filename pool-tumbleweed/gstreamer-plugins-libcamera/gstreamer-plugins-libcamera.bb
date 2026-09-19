SUMMARY = "GStreamer plugins from libcamera"
DESCRIPTION = "libcamera is an experimental camera user-space API. \
This is its integration plugin for gstreamer."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "gstreamer-plugins-libcamera-0.7.2-1.2.aarch64.rpm"
RPM_HASH = "1864d1ba41cbb098c6edbdd765b7ab68b6942e3fe911e59cdcd6d9a87d196c35daf176b20d885872f002af60a27fc9d7a8f603b7898871b59a730e09610b843d"

RPROVIDES:${PN} += "gstreamer-plugins-libcamera \
gstreamer1 \
libgstlibcamera.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcamera-base.so.0.7 \
libcamera.so.0.7 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstallocators-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libstdc++.so.6"

inherit rpm
