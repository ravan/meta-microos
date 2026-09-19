SUMMARY = "PulseAudio commandline mixer"
DESCRIPTION = "pamixer is like amixer but for PulseAudio. It can control the volume levels \
of the sinks."
LICENSE = "GPL-3.0-or-later"

PV = "1.6"

RPM_NAME = "pamixer-1.6-1.15.aarch64.rpm"
RPM_HASH = "b6bef4f781fc7eca7a0de8e38d2b878745c1c7c1239f2d98948da0a7e121ec602544bb2160c4058e0635a09dcb32db0176a858837317fec5a1622d69a66fdab3"

RPROVIDES:${PN} += "pamixer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpulse.so.0 \
libstdc++.so.6"

inherit rpm
