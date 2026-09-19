SUMMARY = "Noise suppression plugin based on Xiph's RNNoise - lv2 plugin"
DESCRIPTION = "The plugin is meant to suppress a wide range of noise origins \
(from original paper): computer fans, office, crowd, airplane, \
car, train, construction. \
 \
From my tests mild background noise is always suppressed, \
loud sounds, like clicking of mechanical keyboard, are \
suppressed while there is no voice however they are only \
reduced in volume when voice is present. \
 \
The plugin is made to work with 1 channel and/or 2 channels \
(ladspa plugin), 16 bit, 48000 Hz audio input. \
Other sample rates may work, or not... \
 \
This package holds the lv2 plugin."
LICENSE = "GPL-3.0-only"

PV = "1.21"

RPM_NAME = "lv2-rnnoise-1.21-1.3.aarch64.rpm"
RPM_HASH = "4c842da5b4c779ee691b26a0f26746762b6a90483b171e792451c5664037c1456dc5737d92aefe37bff72b435d47fb1f24374760fdca51f793d459fa0a31f705"

RPROVIDES:${PN} += "librnnoise-mono.so \
librnnoise-stereo.so \
lv2-rnnoise"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatomic.so.1 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
