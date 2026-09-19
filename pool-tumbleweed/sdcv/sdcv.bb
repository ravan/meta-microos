SUMMARY = "Console version of the Stardict program"
DESCRIPTION = "Console version of the Stardict program. \
It can employ all the dictionary files that belong to StarDict. \
The word sdcv stands for StarDict under Console Version."
LICENSE = "GPL-2.0-only"

PV = "0.5.5"

RPM_NAME = "sdcv-0.5.5-1.10.aarch64.rpm"
RPM_HASH = "2686a174e14078150b2f1663b03f61927372f3cdff248b31a698d5bec6cd0928d91f8ffc32a7cdf1947dd342f6f4668b2b943a0040f333ab80ffdc990f2f39e6"

RPROVIDES:${PN} += "sdcv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libreadline.so.8 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
