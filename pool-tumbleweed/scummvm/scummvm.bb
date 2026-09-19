SUMMARY = "Interpreter for several adventure games"
DESCRIPTION = "ScummVM is an interpreter that will play graphic adventure games written for \
LucasArts' SCUMM virtual machine (such as Day of the Tentacle and \
Monkey Island), Sierra's AGI adventures (such as early King's Quest and \
Space Quest games), Adventure Soft's Simon the Sorcerer 1, 2 and Feeble Files, \
Revolution Software's Beneath a Steel Sky and Broken Sword 1, 2 and 2.5, \
Interactive Binary Illusions' Flight of the Amazon Queen, \
Coktel Vision's Gobliiins, Wyrmkeep's Inherit the Earth, Westwood's \
Legend of Kyrandia, and various others."
LICENSE = "GPL-3.0-or-later"

PV = "2026.3.0"

RPM_NAME = "scummvm-2026.3.0-1.1.aarch64.rpm"
RPM_HASH = "e4bbdf6f070a840c8e2bd19ce5c240d25ac90731840e991cbd44eef3e56df1fcc4a58cc6ba00a39c47a07149c9be6f222272e079f9a8b43215d29a7ba0e6ac6a"

RPROVIDES:${PN} += "scummvm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libSDL2-2.0.so.0 \
libSDL2-net-2.0.so.0 \
liba52.so.0 \
libasound.so.2 \
libc.so.6 \
libcurl.so.4 \
libdiscord-rpc.so.3.4.0 \
libfaad.so.2 \
libfluidsynth.so.3 \
libfreetype.so.6 \
libfribidi.so.0 \
libgif.so.7 \
libieee1284.so.3 \
libjpeg.so.8 \
libm.so.6 \
libmad.so.0 \
libmpcdec.so.5 \
libmpeg2.so.0 \
libogg.so.0 \
libopenmpt.so.0 \
libpng16.so.16 \
libsonivox.so.4 \
libspeechd.so.2 \
libstdc++.so.6 \
libtheoradec.so.2 \
libvorbis.so.0 \
libvorbisfile.so.3 \
libvpx.so.12 \
libz.so.1"

inherit rpm
