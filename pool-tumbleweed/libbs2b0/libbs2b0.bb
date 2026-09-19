SUMMARY = "The Bauer stereophonic-to-binaural DSP library"
DESCRIPTION = "The Bauer stereophonic-to-binaural DSP (bs2b) library and plugins is designed to \
improve headphone listening of stereo audio records. Recommended for headphone \
prolonged listening to disable superstereo fatigue without essential \
distortions."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "libbs2b0-3.1.0-14.11.aarch64.rpm"
RPM_HASH = "8e6fd3df6fd853d913b29a061e1b90980c0e32df798ae71fc836b71c58c13ccd0ec6e0fa0e70eed88e3792928252cbb739d3f381feba786631a53a07008e4fa2"

RPROVIDES:${PN} += "libbs2b.so.0 \
libbs2b0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
