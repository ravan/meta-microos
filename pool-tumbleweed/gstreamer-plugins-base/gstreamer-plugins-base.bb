SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "gstreamer-plugins-base-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "3b2634cf3138e46b1e855555586f5be392dce8817a0718d8ddd4a37bf752572599bd2bcace00d28c666da661a2c0df7bde3c6efe92caebf13d388b300974016b"

RPROVIDES:${PN} += "gst-plugins-base \
gstreamer-plugins-base \
gstreamer1 \
libgstadder.so \
libgstalsa.so \
libgstapp.so \
libgstaudioconvert.so \
libgstaudiomixer.so \
libgstaudiorate.so \
libgstaudioresample.so \
libgstaudiotestsrc.so \
libgstbasedebug.so \
libgstcompositor.so \
libgstdsd.so \
libgstencoding.so \
libgstgio.so \
libgstogg.so \
libgstopengl.so \
libgstopus.so \
libgstoverlaycomposition.so \
libgstpango.so \
libgstpbtypes.so \
libgstplayback.so \
libgstrawparse.so \
libgstsubparse.so \
libgsttcp.so \
libgsttheora.so \
libgsttypefindfunctions.so \
libgstvideoconvertscale.so \
libgstvideorate.so \
libgstvideotestsrc.so \
libgstvolume.so \
libgstvorbis.so \
libgstximagesink.so \
libgstxvimagesink.so"

RDEPENDS:${PN} += "gstreamer \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXi.so.6 \
libXv.so.1 \
libasound.so.2 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgstallocators-1.0.so.0 \
libgstapp-1.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstcontroller-1.0.so.0 \
libgstgl-1.0.so.0 \
libgstnet-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstriff-1.0.so.0 \
libgsttag-1.0.so.0 \
libgstvideo-1.0.so.0 \
libjpeg.so.8 \
libm.so.6 \
libogg.so.0 \
libopus.so.0 \
liborc-0.4.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libtheoradec.so.2 \
libtheoraenc.so.2 \
libvorbis.so.0 \
libvorbisenc.so.2"

inherit rpm
