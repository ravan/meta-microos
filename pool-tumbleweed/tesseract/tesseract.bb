SUMMARY = "First-person shooter with cooperative in-game map editing"
DESCRIPTION = "Tesseract is a first-person shooter game focused on instagib deathmatch \
and capture-the-flag gameplay as well as cooperative in-game map editing. \
 \
Tesseract is based on Cube2/Sauerbraten. New rendering features include fully \
dynamic omnidirectional shadows, global illumination, HDR lighting, deferred \
shading and morphological/temporal/multisample anti-aliasing."
LICENSE = "Zlib"

PV = "2024_06_15"

RPM_NAME = "tesseract-2024_06_15-2.1.aarch64.rpm"
RPM_HASH = "85463cd44a65dd733c33d9cd4ef83d8342bd8af64aee26700783887228877a7432ec2e11505928e9e564729369f86bb890357bd98d682d428e5e660a1cae8752"

RPROVIDES:${PN} += "tesseract"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libX11.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
tesseract-data"

inherit rpm
