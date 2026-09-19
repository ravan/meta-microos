SUMMARY = "Development files for pipewire-libjack-0_3"
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
This package provides the PipeWire replacement development files \
for libjack."
LICENSE = "MIT"

PV = "1.6.8"

RPM_NAME = "pipewire-libjack-0_3-devel-1.6.8-2.1.aarch64.rpm"
RPM_HASH = "257297e875cd431b76960f384180e8eefbf0093da991bace3aa73f0e607d516c05b116637f8325462d44e5835348fdd6ba47936a03997efeedac52e71921ccbe"

RPROVIDES:${PN} += "pipewire-libjack-0-3-devel \
pkgconfig-jack \
pkgconfig-jackserver"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pipewire-libjack-0-3"

inherit rpm
