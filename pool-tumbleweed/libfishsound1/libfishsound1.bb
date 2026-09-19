SUMMARY = "Wrapper library for audio decoding and encoding"
DESCRIPTION = "libfishsound provides a programming interface for decoding and \
encoding audio data using the three Xiph.org codecs FLAC, Speex and \
Vorbis. \
 \
libfishsound can handle raw codec streams from a lower level layer \
such as UDP datagrams. When these codecs are used in files, they are \
commonly encapsulated in Ogg to produce Ogg FLAC, Speex and Ogg \
Vorbis files. \
 \
libfishsound is a wrapper around the existing codec libraries and \
provides a higher-level programming interface. It has no direct \
dependencies on Ogg encapsulation, though it is most commonly used in \
conjunction with liboggz to decode or encode audio tracks in Ogg \
files, including Ogg Theora and Annodex."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "libfishsound1-1.0.1-1.5.aarch64.rpm"
RPM_HASH = "96c2d86bcfbaa1d1b0f25157cd4cf82adf4b4b2ea69e111669c33edfad13034054572a1cca90c49e467aef26d6ae85a1c688cf70fa885b172d4442d6a79e9ece"

RPROVIDES:${PN} += "libfishsound.so.1 \
libfishsound1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libc.so.6 \
libspeex.so.1 \
libvorbis.so.0 \
libvorbisenc.so.2"

inherit rpm
