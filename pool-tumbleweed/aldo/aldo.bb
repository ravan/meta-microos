SUMMARY = "Console-based morse tutor"
DESCRIPTION = "Aldo is a morse code learning tool which provides multiple types of training \
exercises: Classic exercise, Koch method, Read from file (text file), Callsign \
exercies (random callsigns)."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.8"

RPM_NAME = "aldo-0.7.8-2.4.aarch64.rpm"
RPM_HASH = "435a25fcad3983371ffad3fdf6efaf7955f0147b61d90b0d84ee7bdb46b43e2db4a6e6c5e9681a825456ddd2e9bb94b7324cb8628ed431b705f95d0f167a5ac7"

RPROVIDES:${PN} += "aldo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libao.so.4 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
