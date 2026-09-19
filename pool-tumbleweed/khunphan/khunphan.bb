SUMMARY = "Traditional Thai Puzzle Board Game in 3D with Wooden Blocks"
DESCRIPTION = "The goal of this game is to move the biggest token to a specific \
position. A tutorial and solution hint is available for beginners. The \
game is visible as a three-dimensional model with different camera \
positions. All movements, including the menus, are physically \
calculated. \
 \
Different themes, like wood, rock, metal, marble, bubbles, and \
painting, are available. Themes influence both the display and the \
sound effects. Ambient and Drum & Bass music from Nifflas \
(www.nifflas.com) gives the game a unique atmosphere."
LICENSE = "GPL-2.0+"

PV = "0.55"

RPM_NAME = "khunphan-0.55-478.14.aarch64.rpm"
RPM_HASH = "effdcee4b35fd68b25ab6a2b8d8ea82a49df55b2f0c01b95e0339bbd5db50fbca99476d3f0e0444a30a70c2718aeeb78ea6e54c637b3ab70d090678e376c7e36"

RPROVIDES:${PN} += "khunphan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libSDL-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libglut.so.3 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libxml2.so.16 \
pwdutils"

inherit rpm
