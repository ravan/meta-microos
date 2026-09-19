SUMMARY = "Firmware loader for RME Hammerfall DSP cards"
DESCRIPTION = "This is the firmware loader program for RME Hammerfall DSP cards."
LICENSE = "GPL-2.0-or-later"

PV = "1.2"

RPM_NAME = "hdsploader-1.2-29.4.aarch64.rpm"
RPM_HASH = "5c7de1312fd84283d4c241d84cecdd9c0168f4734c07f329bc36b6ac77816ff6ad656c125889b079c7042a93c4bea3c4c8338f32e6094f7e4c138ee60a5bf96b"

RPROVIDES:${PN} += "alsa-tools-/usr/bin/hdsploader \
hdsploader"

RDEPENDS:${PN} += "alsa-firmware \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
