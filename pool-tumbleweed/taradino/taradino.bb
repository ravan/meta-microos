SUMMARY = "SDL port of the Rise of the Triad engine"
DESCRIPTION = "The package contains an SDL-based engine (of the icculus 'lineage') for the \
first-person 3D action game 'Rise of the Triad'. \
 \
The ROTT engine is a derivative of the Wolfenstein 3D one, inheriting \
level design limits like orthogonal walls and flat floor and ceiling \
heights throughout a map. However, the engine did pioneer panoramic \
skies, simulated dynamic lighting, fog, bullet holes, breakable glass \
walls, and synthetic level-over-level environments through use of \
individual collision objects."
LICENSE = "GPL-2.0-or-later"

PV = "20251222"

RPM_NAME = "taradino-20251222-1.3.aarch64.rpm"
RPM_HASH = "9c414b5a697aa0faf1d06e87e626cc6a59a811e11ddb805d75293f7a4d4bf26fc2ab74af2503d95318437445b2f1c59bc6f4c6253eb6bfb3ae877128328b8399"

RPROVIDES:${PN} += "rott \
taradino"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libADLMIDI.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
