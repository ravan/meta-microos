SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "gstreamer-plugins-bad-devel-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "eadb114bdb6983bbc5a84b8434588c7488fd674575433e1519fcc9e646fd2f44edc5be976a1811de87e4f448f8406eb55792f09b22840d445c955276a35e9b8e"

RPROVIDES:${PN} += "gstreamer-plugins-bad-devel \
pkgconfig-gstreamer-analytics-1.0 \
pkgconfig-gstreamer-bad-audio-1.0 \
pkgconfig-gstreamer-codecparsers-1.0 \
pkgconfig-gstreamer-cuda-1.0 \
pkgconfig-gstreamer-hip-1.0 \
pkgconfig-gstreamer-hip-gl-1.0 \
pkgconfig-gstreamer-insertbin-1.0 \
pkgconfig-gstreamer-mpegts-1.0 \
pkgconfig-gstreamer-mse-1.0 \
pkgconfig-gstreamer-photography-1.0 \
pkgconfig-gstreamer-play-1.0 \
pkgconfig-gstreamer-player-1.0 \
pkgconfig-gstreamer-plugins-bad-1.0 \
pkgconfig-gstreamer-sctp-1.0 \
pkgconfig-gstreamer-va-1.0 \
pkgconfig-gstreamer-vulkan-1.0 \
pkgconfig-gstreamer-vulkan-wayland-1.0 \
pkgconfig-gstreamer-vulkan-xcb-1.0 \
pkgconfig-gstreamer-wayland-1.0 \
pkgconfig-gstreamer-webrtc-1.0 \
pkgconfig-gstreamer-webrtc-nice-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gstreamer-plugins-bad \
gstreamer-plugins-bad-fluidsynth \
libgstadaptivedemux-1-0-0 \
libgstanalytics-1-0-0 \
libgstbadaudio-1-0-0 \
libgstbasecamerabinsrc-1-0-0 \
libgstcodecparsers-1-0-0 \
libgstcodecs-1-0-0 \
libgstcuda-1-0-0 \
libgstdxva-1-0-0 \
libgsthip-1-0-0 \
libgstinsertbin-1-0-0 \
libgstisoff-1-0-0 \
libgstmpegts-1-0-0 \
libgstmse-1-0-0 \
libgstphotography-1-0-0 \
libgstplay-1-0-0 \
libgstplayer-1-0-0 \
libgstsctp-1-0-0 \
libgsttranscoder-1-0-0 \
libgsturidownloader-1-0-0 \
libgstva-1-0-0 \
libgstvulkan-1-0-0 \
libgstwayland-1-0-0 \
libgstwebrtc-1-0-0 \
libgstwebrtcnice-1-0-0 \
pkgconfig-gmodule-no-export-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-allocators-1.0 \
pkgconfig-gstreamer-app-1.0 \
pkgconfig-gstreamer-audio-1.0 \
pkgconfig-gstreamer-base-1.0 \
pkgconfig-gstreamer-gl-1.0 \
pkgconfig-gstreamer-gl-prototypes-1.0 \
pkgconfig-gstreamer-hip-1.0 \
pkgconfig-gstreamer-pbutils-1.0 \
pkgconfig-gstreamer-play-1.0 \
pkgconfig-gstreamer-sdp-1.0 \
pkgconfig-gstreamer-tag-1.0 \
pkgconfig-gstreamer-video-1.0 \
pkgconfig-gstreamer-vulkan-1.0 \
pkgconfig-gstreamer-webrtc-1.0 \
pkgconfig-libdrm \
pkgconfig-libva \
pkgconfig-libva-drm \
pkgconfig-nice \
pkgconfig-vulkan \
pkgconfig-wayland-client \
pkgconfig-xcb \
pkgconfig-xkbcommon \
pkgconfig-xkbcommon-x11 \
typelib-1-0-CudaGst-1-0 \
typelib-1-0-GstAnalytics-1-0 \
typelib-1-0-GstBadAudio-1-0 \
typelib-1-0-GstCodecParsers-1-0 \
typelib-1-0-GstCodecs-1-0 \
typelib-1-0-GstCuda-1-0 \
typelib-1-0-GstDxva-1-0 \
typelib-1-0-GstHip-1-0 \
typelib-1-0-GstHipGL-1-0 \
typelib-1-0-GstInsertBin-1-0 \
typelib-1-0-GstMpegts-1-0 \
typelib-1-0-GstMse-1-0 \
typelib-1-0-GstPlay-1-0 \
typelib-1-0-GstPlayer-1-0 \
typelib-1-0-GstVa-1-0 \
typelib-1-0-GstWebRTC-1-0"

inherit rpm
