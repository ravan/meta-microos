SUMMARY = "Noise suppression plugin based on Xiph's RNNoise - vst3 plugin"
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
This package holds the vst3 plugin."
LICENSE = "GPL-3.0-only"

PV = "1.21"

RPM_NAME = "vst3-rnnoise-1.21-1.3.aarch64.rpm"
RPM_HASH = "2a7bcdd0ba7f6075d83c0858f933622510c451132d12385d6990e57e6cadfc212c1a02ed7083f7fca6f45a61994c794b019dd13bac277f9fdb7cb4fd79b69bfd"

RPROVIDES:${PN} += "vst3-rnnoise"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatomic.so.1 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
