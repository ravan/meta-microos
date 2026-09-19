SUMMARY = "Simple Movie Player"
DESCRIPTION = "pia is a simple movie player which can playback AVI and QuickTime \
movies recorded by xawtv, motv, and streamer. Other movies might work \
as well."
LICENSE = "GPL-2.0-or-later"

PV = "3.107"

RPM_NAME = "pia-3.107-3.9.aarch64.rpm"
RPM_HASH = "4db861a3f8187fb1ae03b9564753e2c4b5a8b71f92bbab7979af2673519300a2640fae9a778919e9f0d1d923d321e68961ec3de9e1a844fd346ab27fa36f3035"

RPROVIDES:${PN} += "pia"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXext.so.6 \
libXt.so.6 \
libXv.so.1 \
libc.so.6 \
libjpeg.so.8 \
tv-common"

inherit rpm
