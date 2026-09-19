SUMMARY = "Software Synthesizer and MIDI Player"
DESCRIPTION = "TiMidity plays MIDI files without external MIDI instruments and \
converts MIDI files to WAV using GUS/patch and SoundFont for voice \
data."
LICENSE = "GPL-2.0-or-later"

PV = "2.15.0"

RPM_NAME = "timidity-2.15.0-5.6.aarch64.rpm"
RPM_HASH = "5e0299bfc8e5f19cb3af665cddbf2fc5633dfe00ceb09a997b9b563a73888db6cd2820336e8b1db6ea2c16c34405f18b1722717e33cccb4f6852265d8c41248c"

RPROVIDES:${PN} += "config-timidity \
timidity"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libX11.so.6 \
libXext.so.6 \
libao.so.4 \
libasound.so.2 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libjack.so.0 \
libm.so.6 \
libncurses.so.6 \
libogg.so.0 \
libpng16.so.16 \
libslang.so.2 \
libspeex.so.1 \
libtinfo.so.6 \
libvorbis.so.0 \
libvorbisenc.so.2"

inherit rpm
