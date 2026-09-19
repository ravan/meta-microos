SUMMARY = "Limit-removing source port of Heretic"
DESCRIPTION = "Source port of Heretic based on Chocolate Doom and Crispy Doom \
with significant additions from DOOM Retro. \
 \
The game data files are required. They will be automatically picked up \
if 'Heretic + Hexen' is installed from Steam. \
 \
International Heretic supports high rendering resolutions, visual improvements \
and optional gameplay adjustments, while preserving the ability to play in the \
spirit of the original vanilla game. \
 \
Major Features: \
 \
- Support for the Heretic re-release (part of 'Heretic + Hexen') \
- Optional True Color renderer \
- Up to x6 (1200p) rendering resolutions \
- Uncapped framerate \
- Additional, darker gamma-correction levels \
- Post-processing effects \
- Support for OPL2, OPL3, MIDI, Fluidsynth and GUS music playback \
- In-game keyboard and mouse bindings \
- Various visual, audible, physical and demo enhancements \
- Compatibility with vanilla-engine demos \
- Removed limitations of vanilla engine \
- Support for nodes in extended format (ZDBSP and DeePBSP) \
- Support for BEX/DEHEXTRA DeHackEd extensions"
LICENSE = "GPL-2.0-or-later"

PV = "9.0"

RPM_NAME = "international-heretic-9.0-1.2.aarch64.rpm"
RPM_HASH = "f1dd18da13c51560aea3f1ab0f8ed8c7a7c9e93c3d66e74828449e11ffdd1b73d9878dfdec1fa8462f554af5e15c0ea9d60dd697b9b97d23b6ca38b14f8cf99e"

RPROVIDES:${PN} += "international-heretic"

RDEPENDS:${PN} += "international-doom-common \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-net-2.0.so.0 \
libc.so.6 \
libfluidsynth.so.3 \
libm.so.6 \
libsamplerate.so.0"

inherit rpm
