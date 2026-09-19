SUMMARY = "A Multimedia Framework designed to be an audio and video server and more"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
Some of its features include: \
 \
 * Capture and playback of audio and video with minimal latency; \
 * Real-time Multimedia processing on audio and video; \
 * Multiprocess architecture to let applications share multimedia content; \
 * GStreamer plugins for easy use and integration in current applications; \
 * Sandboxed applications support. \
 \
This package provides the PipeWire shared library."
LICENSE = "MIT"

PV = "1.6.8"

RPM_NAME = "libpipewire-0_3-0-1.6.8-2.1.aarch64.rpm"
RPM_HASH = "3f955f6436ac4794e4623f47cb958e2660e105933b33c4a561fe9afd6b1350487b5aa6de13c714aedf44aa366c5ab9b9a02b9597bc3f64466cf867438c6cbfb4"

RPROVIDES:${PN} += "libpipewire-0-3-0 \
libpipewire-0.3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
pipewire-modules-0-3 \
pipewire-spa-plugins-0-2"

inherit rpm
