SUMMARY = "PipeWire PulseAudio implementation"
DESCRIPTION = "This package provides a PulseAudio implementation based on PipeWire"
LICENSE = "MIT"

PV = "1.6.8"

RPM_NAME = "pipewire-pulseaudio-1.6.8-2.1.aarch64.rpm"
RPM_HASH = "a83ece4d8f04a1ecb6e54ebf31f66ce046f8f57f800b2aec9ecd81df68191635c3eb445738fb806ca33369c9073e98c573f481a2a8d4e6d42aedc36329ad28de"

RPROVIDES:${PN} += "libpipewire-module-protocol-pulse.so \
pipewire-pulseaudio \
pulseaudio-daemon"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libdbus-1.so.3 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libpipewire-0-3-0 \
libpipewire-0.3.so.0 \
pipewire \
pulseaudio-utils"

inherit rpm
