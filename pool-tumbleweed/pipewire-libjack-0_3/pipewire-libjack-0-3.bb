SUMMARY = "PipeWire libjack replacement libraries"
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
This package provides the PipeWire replacement libraries for libjack."
LICENSE = "MIT"

PV = "1.6.8"

RPM_NAME = "pipewire-libjack-0_3-1.6.8-2.1.aarch64.rpm"
RPM_HASH = "16f2d4498f955f690a8c97362929ff1eeb81dd253242d782b8bc30b0b0ac5bb80e3595e37b5c0fcdafd3a899b4ad5eb545163e4b0d83e4b74e5ebc5a60468637"

RPROVIDES:${PN} += "libjack.so.0 \
libjacknet.so.0 \
libjackserver.so.0 \
pipewire-libjack-0-3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpipewire-0.3.so.0"

inherit rpm
