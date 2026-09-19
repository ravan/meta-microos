SUMMARY = "A ffmpeg/libav plugin for GStreamer"
DESCRIPTION = "GStreamer is a streaming media framework, based on graphs of filters which \
operate on media data. Applications using this library can do anything \
from real-time sound processing to playing videos, and just about anything \
else media-related. Its plugin-based architecture means that new data \
types or processing capabilities can be added simply by installing new \
plug-ins. \
 \
This plugin contains the FFmpeg codecs, containing codecs for most popular \
multimedia formats."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "gstreamer-plugins-libav-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "2aa9d434f3c830a3ca279cccf3acb61ed7b3ba9833ad6b38975f0e8bbf1f3ca0f1a05a92a9a04fa60eea8c59f8b6ae3a210cd6042092d9c2a5e1d777556af3f0"

RPROVIDES:${PN} += "gstreamer-plugins-libav \
gstreamer1 \
libgstlibav.so"

RDEPENDS:${PN} += "gstreamer \
ld-linux-aarch64.so.1 \
libavcodec.so.62 \
libavfilter.so.11 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0"

inherit rpm
