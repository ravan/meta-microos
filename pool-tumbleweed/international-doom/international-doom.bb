SUMMARY = "Limit-removing source port of DOOM"
DESCRIPTION = "Source port of Doom based on Chocolate Doom and Crispy Doom \
with significant additions from DOOM Retro. \
 \
The game data files are required. They will be automatically picked up \
if 'Doom + Doom II' is installed from Steam. \
 \
International Doom supports high rendering resolutions, visual improvements \
and optional gameplay adjustments, while preserving the ability to play in the \
spirit of the original vanilla game. \
 \
Major Features: \
 \
- Support for the Doom + Doom II re-release \
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

RPM_NAME = "international-doom-9.0-1.2.aarch64.rpm"
RPM_HASH = "af886b4455e9c293b77680f383a8e3449ee4e625014b2d983523c869475fccc852198f3771cdde5ff40fae85e96c9cba9cf49fae74a9a1579a266d7ac14f7592"

RPROVIDES:${PN} += "international-doom"

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
