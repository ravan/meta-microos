SUMMARY = "Noise suppression plugin based on Xiph's RNNoise - ladspa plugin"
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
This package holds the ladspa plugin."
LICENSE = "GPL-3.0-only"

PV = "1.21"

RPM_NAME = "ladspa-rnnoise-1.21-1.3.aarch64.rpm"
RPM_HASH = "375cbb28bd7862d2f826c7215f9dd1cb82d0f8fed1aae4fd9dcb4f5b47f1b6aee0de9d714d955f7c5ca07d98c0ddd8b514acda9cb44bb98f229484fc8870759e"

RPROVIDES:${PN} += "ladspa-rnnoise \
librnnoise-ladspa.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatomic.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
