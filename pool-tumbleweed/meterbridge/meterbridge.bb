SUMMARY = "A Meterbridge for the JACK Audio System"
DESCRIPTION = "Meterbridge is a JACK (JACK Audio Connection Kit) client for \
visualizing audio signals."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.3"

RPM_NAME = "meterbridge-0.9.3-1.20.aarch64.rpm"
RPM_HASH = "6af207ffaba975474686228fdfef7c30aa1c65ef8e88f9393730c38110e483248e10dad0c68ed44aed06213c42984e8b0b65161c18f551e3e7f11f3d042b7073"

RPROVIDES:${PN} += "meterbridge"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libc.so.6 \
libjack.so.0 \
libm.so.6"

inherit rpm
