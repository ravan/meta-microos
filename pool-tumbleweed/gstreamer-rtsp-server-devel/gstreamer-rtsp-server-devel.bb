SUMMARY = "Development files for the GStreamer-based RTSP server library"
DESCRIPTION = "Development files for the GStreamer library for building an RTSP server."
LICENSE = "LGPL-2.0-or-later"

PV = "1.28.6"

RPM_NAME = "gstreamer-rtsp-server-devel-1.28.6-1.1.aarch64.rpm"
RPM_HASH = "96b013680c6753a838f340e11b1030d35ff3d509d17a17c9c9c58c9e97f3f715f3e50bc13f9bd9f5befccc5542d3ed395c8bb14e894b9c168cba5ed65391c6b8"

RPROVIDES:${PN} += "gst-rtsp-server-devel \
gstreamer-rtsp-server-devel \
gstreamer1 \
libgstrtspclientsink.so \
pkgconfig-gstreamer-rtsp-server-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgstrtsp-1.0.so.0 \
libgstrtspserver-1-0-0 \
libgstrtspserver-1.0.so.0 \
libgstsdp-1.0.so.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-app-1.0 \
pkgconfig-gstreamer-net-1.0 \
pkgconfig-gstreamer-rtp-1.0 \
pkgconfig-gstreamer-rtsp-1.0 \
pkgconfig-gstreamer-sdp-1.0 \
pkgconfig-gstreamer-video-1.0 \
typelib-1-0-GstRtspServer-1-0"

inherit rpm
