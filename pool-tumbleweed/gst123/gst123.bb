SUMMARY = "GStreamer based Command Line Music Player"
DESCRIPTION = "The gst123 program is a command line player akin to ogg123 or mpg123, \
but uses gstreamer for decoding, so supports all the codecs gstreamer \
knows."
LICENSE = "LGPL-2.0-or-later"

PV = "0.4.1"

RPM_NAME = "gst123-0.4.1-2.4.aarch64.rpm"
RPM_HASH = "a3407ab141649efae7166c8f60c029bae5ae825c1b9a3a63c990abf6dad13e4351a5d89a5998ae2a095d21d30341857d4544e80d20d7fbf8e31ac1aa35c1c34c"

RPROVIDES:${PN} += "gst123"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-3.so.0 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
