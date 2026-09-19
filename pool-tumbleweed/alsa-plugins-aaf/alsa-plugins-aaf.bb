SUMMARY = "AVTP Audio Format PCM Plug-In for ALSA Library"
DESCRIPTION = "This package contains the AVTP AUdio Format (AAF) I/O plug-in \
for ALSA library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.12"

RPM_NAME = "alsa-plugins-aaf-1.2.12-1.16.aarch64.rpm"
RPM_HASH = "6d659f9c757315407ac92ed1c431da6574642448c64084c87d1ed22bceb63df0524ec8e78b06fb4684b307beef924c4934872f3b9987440422839d0d5196cdee"

RPROVIDES:${PN} += "alsa-plugins-aaf \
libasound-module-pcm-aaf.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libavtp.so.0 \
libc.so.6"

inherit rpm
