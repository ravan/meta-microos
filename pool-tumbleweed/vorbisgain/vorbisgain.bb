SUMMARY = "Replay Gain calculator for Ogg Vorbis files"
DESCRIPTION = "VorbisGain is a utility that uses a psychoacoustic method to correct \
the volume of an Ogg Vorbis file to a predefined standardized \
loudness. \
 \
It is meant as a replacement for the normalization that is commonly \
used before encoding. Although normalization will ensure that each \
song has the same peak volume, this unfortunately does not say \
anything about the apparent loudness of the music, with the end result \
being that many normalized files still don't sound equally \
loud. VorbisGain uses psychoacoustics to address this \
deficiency. Moreover, unlike normalization, it's a lossless procedure \
which works by adding tags to the file. Additionally, it will add \
hints that can be used to prevent clipping on playback. It is based \
upon the ReplayGain technology. \
 \
The end result is that playback is both more convenient and of higher \
quality compared to a non-VorbisGain'ed file."
LICENSE = "LGPL-2.1-only"

PV = "0.37"

RPM_NAME = "vorbisgain-0.37-3.12.aarch64.rpm"
RPM_HASH = "8eba573fa4e41836d799d8ec7fcd2ef83f60f2974e113e070dd7d6f195c68c55b581527ecfb386e5955e920f8760744379eea35f054eba150c660519a9865297"

RPROVIDES:${PN} += "vorbisgain"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libogg.so.0 \
libvorbis.so.0 \
libvorbisfile.so.3"

inherit rpm
