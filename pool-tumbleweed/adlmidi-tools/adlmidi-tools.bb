SUMMARY = "A MIDI player with OPL3 emulation"
DESCRIPTION = "AdlMIDI is a commandline program that plays MIDI files using software \
OPL3 emulation (FM synthesis)."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "1.6.2.1"

RPM_NAME = "adlmidi-tools-1.6.2.1-1.1.aarch64.rpm"
RPM_HASH = "3d44a51ffda443b600c83c5e115e7eeb9ea5c831a10a00e937a68588a2cf876da6b7f084851adb44bbf4d1fefab4b8cff3f89bd9b468ef7fbc4719927d39e590"

RPROVIDES:${PN} += "adlmidi-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libADLMIDI.so.1 \
libSDL2-2.0.so.0 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
