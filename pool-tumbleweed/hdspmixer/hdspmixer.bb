SUMMARY = "GUI tool to control advanced routing of RME Hammerfall DSP cards"
DESCRIPTION = "HDSPMixer is the Linux equivalent of the Totalmix application from RME. \
It is a tool to control the advanced routing features of the RME \
Hammerfall DSP soundcard series."
LICENSE = "GPL-2.0-or-later"

PV = "1.11"

RPM_NAME = "hdspmixer-1.11-29.4.aarch64.rpm"
RPM_HASH = "54633d97363b5cd3bbf120a244b11f59c7aa61faf39c4b978e9e798fe4e318cb8d64a8c42d446f22cd8d2459dd17e657f988baa75b6e8bb5a9c1639badd3a1cf"

RPROVIDES:${PN} += "alsa-tools-gui-/usr/bin/hdspmixer \
hdspmixer"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libfltk.so.1.3 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
