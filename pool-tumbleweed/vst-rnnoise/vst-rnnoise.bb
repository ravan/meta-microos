SUMMARY = "Noise suppression plugin based on Xiph's RNNoise - vst plugin"
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
This package holds the vst plugin."
LICENSE = "GPL-3.0-only"

PV = "1.21"

RPM_NAME = "vst-rnnoise-1.21-1.3.aarch64.rpm"
RPM_HASH = "77beed74c38d4681eaa7e261cec10e6f45b88916aae1f830506ae0c46f520abd0f6fd1baefa67e7d3a99a5e1aba160ed96f41f679d58a8ce2bbe0bae94bee58f"

RPROVIDES:${PN} += "librnnoise-mono.so \
librnnoise-stereo.so \
vst-rnnoise"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatomic.so.1 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
