SUMMARY = "Rate Converter Plug-In for ALSA Library using Speex"
DESCRIPTION = "This package contains the sample rate converter plugin for ALSA \
library using Speex sample rate converter."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.12"

RPM_NAME = "alsa-plugins-speexrate-1.2.12-1.16.aarch64.rpm"
RPM_HASH = "f99c370f366244762d93f2bdd62e660576a688bbcea838d63403bb74392e3ab898e785d8a32e802bd0b5561b792c3cd458014d419208a90560320f18bf234252"

RPROVIDES:${PN} += "alsa-plugins-speexrate \
libasound-module-rate-speexrate.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6"

inherit rpm
