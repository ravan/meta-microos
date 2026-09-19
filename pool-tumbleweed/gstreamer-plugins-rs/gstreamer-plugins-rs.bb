SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new \
plug-ins. \
 \
This package provides various plugins written in Rust."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "gstreamer-plugins-rs-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "8876c59a8fefd07e351ddb423c8d5b53dbd6c6a0358d2a4611ca645edcd7dbfea8ca596f063f6dd75a8cd2e91823ebb1e8e22f54c6e5c384019f66561f29ac28"

RPROVIDES:${PN} += "gstreamer-plugins-rs \
gstreamer1 \
libgstburn.so \
libgstcdg.so \
libgstclaxon.so \
libgstdav1d.so \
libgstdebugseimetainserter.so \
libgstdeepgram.so \
libgstdemucs.so \
libgstelevenlabs.so \
libgstfallbackswitch.so \
libgstffv1.so \
libgstgif.so \
libgstgopbuffer.so \
libgstgtk4.so \
libgsthlsmultivariantsink.so \
libgsthlssink3.so \
libgsthsv.so \
libgsticecast.so \
libgstisobmff.so \
libgstjson.so \
libgstlewton.so \
libgstlivesync.so \
libgstmpegtslive.so \
libgstndi.so \
libgstoriginalbuffer.so \
libgstquinn.so \
libgstraptorq.so \
libgstrav1e.so \
libgstregex.so \
libgstreqwest.so \
libgstrsanalytics.so \
libgstrsaudiofx.so \
libgstrsaudioparsers.so \
libgstrsclosedcaption.so \
libgstrsfile.so \
libgstrsflv.so \
libgstrsinter.so \
libgstrsonvif.so \
libgstrspng.so \
libgstrsrtp.so \
libgstrsrtsp.so \
libgstrstracers.so \
libgstrsvalidate.so \
libgstrsvideofx.so \
libgstrswebp.so \
libgstrswebrtc.so \
libgstsodium.so \
libgstspeechmatics.so \
libgstspotify.so \
libgststreamgrouper.so \
libgsttextaccumulate.so \
libgsttextahead.so \
libgsttextwrap.so \
libgstthreadshare.so \
libgsttogglerecord.so \
libgsturiplaylistbin.so \
libgstwebrtchttp.so \
libgstwhisper.so"

RDEPENDS:${PN} += "gstreamer \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libdav1d.so.7 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgstallocators-1.0.so.0 \
libgstanalytics-1.0.so.0 \
libgstapp-1.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstgl-1.0.so.0 \
libgstnet-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstrtp-1.0.so.0 \
libgstsdp-1.0.so.0 \
libgsttag-1.0.so.0 \
libgstvalidate-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgstwebrtc-1.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6 \
libwebpdemux.so.2"

inherit rpm
