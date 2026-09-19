SUMMARY = "A Multimedia Framework designed to be an audio and video server and more"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
Some of its features include: \
 \
 * Capture and playback of audio and video with minimal latency; \
 * Real-time Multimedia processing on audio and video; \
 * Multiprocess architecture to let applications share multimedia content; \
 * GStreamer plugins for easy use and integration in current applications; \
 * Sandboxed applications support."
LICENSE = "MIT"

PV = "1.6.8"

RPM_NAME = "pipewire-1.6.8-2.1.aarch64.rpm"
RPM_HASH = "81e7d66d2045ae401030173e98110766d2ff9bcb904188e88197b07a547daae5b3de1040da768e5d8c38209bc37ac755de438f2a027992287a17d72163b493e1"

RPROVIDES:${PN} += "pipewire"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpipewire-0-3-0 \
libpipewire-0.3.so.0 \
pipewire-modules-0-3 \
pipewire-session-manager \
pipewire-spa-plugins-0-2 \
pipewire-spa-tools \
pipewire-tools \
rtkit"

inherit rpm
