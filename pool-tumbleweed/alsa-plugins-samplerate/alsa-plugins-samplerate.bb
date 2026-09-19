SUMMARY = "Samplerate Plug-In for ALSA Library"
DESCRIPTION = "This package contains the sample rate converter plugin for ALSA \
library using libsamplerate."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.12"

RPM_NAME = "alsa-plugins-samplerate-1.2.12-1.16.aarch64.rpm"
RPM_HASH = "3233d1f74f9a33b0cbe56d62c5e1e6502af43f0ba0337cf3d43cefc4cfbfe3fd869739513740554b6ba31907d8b3bbfba801e7480361c12ab4e720698cd5db77"

RPROVIDES:${PN} += "alsa-plugins-samplerate \
libasound-module-rate-samplerate.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libsamplerate.so.0"

inherit rpm
