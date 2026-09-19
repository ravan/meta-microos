SUMMARY = "Open Cubic Player for MOD/S3M/XM/IT/MIDI music files"
DESCRIPTION = "Open Cubic Player is a music file player ported from DOS that supports \
Amiga MOD module formats and many variants, such as MTM, STM, 669, \
S3M, XM, and IT.  It is also able to render MIDI files using sound \
patches and play SID, OGG Vorbis, FLAC, and WAV files.  OCP provides a \
nice text-based interface with several text-based and graphical \
visualizations."
LICENSE = "CC-BY-3.0 & GPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "ocp-3.5.0-1.1.aarch64.rpm"
RPM_HASH = "acbefeda9ddd06693bf29db31775c76d72f1bdbb1d8221beab19218067117a31433b7a155feb074fc4f161a7a719e58a331e1495abb2d87422a4bc983d4fd29e"

RPROVIDES:${PN} += "bundled-adplug \
bundled-adplugdb \
bundled-libbinio \
bundled-libsidplayfp \
bundled-timidity++ \
libocp.so \
ocp \
opencubicplayer"

RDEPENDS:${PN} += "/usr/bin/sh \
curl \
gnu-unifont-otf-fonts \
ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libSDL3.so.0 \
libX11.so.6 \
libXext.so.6 \
libXpm.so.4 \
libXxf86vm.so.1 \
libancient.so.2 \
libasound.so.2 \
libbz2.so.1 \
libc.so.6 \
libcjson.so.1 \
libdiscid.so.0 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgme.so.0 \
libjpeg.so.8 \
libm.so.6 \
libmad.so.0 \
libncursesw.so.6 \
libogg.so.0 \
libpng16.so.16 \
libspeex.so.1 \
libstdc++.so.6 \
libtinfo.so.6 \
libvorbisfile.so.3 \
libwavpack.so.1 \
libz.so.1"

inherit rpm
