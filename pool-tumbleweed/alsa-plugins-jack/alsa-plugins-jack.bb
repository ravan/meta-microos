SUMMARY = "JACK I/O Plug-In for ALSA Library"
DESCRIPTION = "This package contains the JACK (Jack Audio Connection Kit) I/O plug-in \
for ALSA library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.12"

RPM_NAME = "alsa-plugins-jack-1.2.12-1.16.aarch64.rpm"
RPM_HASH = "dfa2af0b73b51378d25831182a46182429d17e62fe0e42ac5c612796f5984da6bcc4f8e607ba30c12db5aacf10980f6406b80fe3807e5e411da924cc6912c3ac"

RPROVIDES:${PN} += "alsa-plugins-jack \
libasound-module-pcm-jack.so"

RDEPENDS:${PN} += "jack \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libjack.so.0"

inherit rpm
