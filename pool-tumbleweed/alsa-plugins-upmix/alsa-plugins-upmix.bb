SUMMARY = "PCM Up-mix Plug-In for ALSA Library"
DESCRIPTION = "This package contains a PCM filter plugin that performs multi-channel \
upmixing for ALSA library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.12"

RPM_NAME = "alsa-plugins-upmix-1.2.12-1.16.aarch64.rpm"
RPM_HASH = "85b7e20a7986033da534a4c1f071b87b2274a598971513a5024f49748245fb1c5838571baca7952adeff858b08406d4b3dee5876f5de76b2751ea094c9a95a19"

RPROVIDES:${PN} += "alsa-plugins-upmix \
libasound-module-pcm-upmix.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
