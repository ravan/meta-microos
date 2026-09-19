SUMMARY = "GStreamer renderer plugin for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides a standalone MediaRenderer plugin, based on the \
GStreamer playbin3 element."
LICENSE = "LGPL-2.0-or-later"

PV = "45.2"

RPM_NAME = "rygel-plugin-gstreamer-renderer-45.2-1.2.aarch64.rpm"
RPM_HASH = "617a47f1e357efe84880d0d5c6a3aeb1a1b20facd4fbe66c54abc4c80994ec42d54dc0dc5f566aecd331c97c6440eceb7d92935720c3bb894738070f9b488335"

RPROVIDES:${PN} += "librygel-playbin.so \
rygel-plugin-gstreamer-renderer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
librygel-core-2.8.so.0 \
librygel-renderer-2.8.so.0 \
librygel-renderer-gst-2.8.so.0 \
rygel"

inherit rpm
