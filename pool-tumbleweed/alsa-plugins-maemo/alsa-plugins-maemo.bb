SUMMARY = "Maemo Plug-Ins for ALSA Library"
DESCRIPTION = "This package contains ALSA-library plug-ins using maemo SDK for \
Nokia 770."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.12"

RPM_NAME = "alsa-plugins-maemo-1.2.12-1.16.aarch64.rpm"
RPM_HASH = "a549eb4eb42cc6f68a291fb1fb3580d1790ccb79f274092d386ec35a8b906c9e2c0cbb7ce6053c5db9a114de8f150187aa22eb913bad1cb2b0055b452b40ab0c"

RPROVIDES:${PN} += "alsa-plugins-maemo \
libasound-module-ctl-dsp-ctl.so \
libasound-module-pcm-alsa-dsp.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libdbus-1.so.3"

inherit rpm
