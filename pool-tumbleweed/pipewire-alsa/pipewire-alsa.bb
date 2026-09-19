SUMMARY = "PipeWire media server ALSA support"
DESCRIPTION = "This package contains an ALSA plugin for the PipeWire media server."
LICENSE = "MIT"

PV = "1.6.8"

RPM_NAME = "pipewire-alsa-1.6.8-2.1.aarch64.rpm"
RPM_HASH = "bb059792dc1fedb078e98fd802e40b57c0134679a8a6e883af895e8f5643f47bf66a385a4533591734afd54a56c567165b7294acfbfad0e412b7150eb31635e1"

RPROVIDES:${PN} += "config-pipewire-alsa \
libasound-module-ctl-pipewire.so \
libasound-module-pcm-pipewire.so \
pipewire-alsa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6 \
libpipewire-0-3-0 \
libpipewire-0.3.so.0 \
pipewire-pulseaudio"

inherit rpm
