SUMMARY = "Limit-removing source port of Hexen"
DESCRIPTION = "Source port of Hexen based on Chocolate Doom and Crispy Doom \
with significant additions from DOOM Retro. \
 \
The game data files are required. They will be automatically picked up \
if 'Heretic + Hexen' is installed from Steam. \
 \
International Hexen supports high rendering resolutions, visual improvements \
and optional gameplay adjustments, while preserving the ability to play in the \
spirit of the original vanilla game. \
 \
Major Features: \
 \
- Support for the Hexen re-release (part of 'Heretic + Hexen') \
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

RPM_NAME = "international-hexen-9.0-1.2.aarch64.rpm"
RPM_HASH = "2fa331abddf4e967dfba483eee1473c89c062f025d9c130929a096a57197fcbf4ba73625a0e35b4cefcdffc931bb19da3fb06abd8ac3d566348b18a234cbea6c"

RPROVIDES:${PN} += "international-hexen"

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
