SUMMARY = "Speex Prerocessor Plug-In for ALSA Library"
DESCRIPTION = "This package contains the Speex preprocessor plugin for ALSA \
library using libspeexdsp."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.12"

RPM_NAME = "alsa-plugins-speex-1.2.12-1.16.aarch64.rpm"
RPM_HASH = "18afa75d63e106099aa97a6a89f6bfe5a18d2273390321d99d43a9e2cb2e22d7ab7930658224a0947dd710d7c1baf3e6055cfe0147f5e16a868dfa60b9a268ea"

RPROVIDES:${PN} += "alsa-plugins-speex \
libasound-module-pcm-speex.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libspeexdsp.so.1"

inherit rpm
