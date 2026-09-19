SUMMARY = "LADSPA caps plugins"
DESCRIPTION = "This package provides a LADSPA (Linux Audio Developer's Simple Plug-in API) \
caps plugins, the C* Audio Plugin Suite including instrument amplifier \
emulation, stomp-box classics, versatile virtual analog oscillators, \
fractal oscillation, reverb, equalization and others."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.26"

RPM_NAME = "ladspa-caps-0.9.26-2.10.aarch64.rpm"
RPM_HASH = "f6cb598deff09267b2834eb3ab3dab3d38352b1b7efac381b377290798fcfee8e813eb89a41e28002d4a0a6fed388174369c114a6af8c372bd658bfb273381a2"

RPROVIDES:${PN} += "ladspa-caps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
