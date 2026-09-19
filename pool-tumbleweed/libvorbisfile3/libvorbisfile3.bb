SUMMARY = "The Vorbis General Audio Compression Codec"
DESCRIPTION = "Vorbis is a fully open, nonproprietary, patent-and-royalty-free, and \
general-purpose compressed audio format for audio and music at fixed \
and variable bit rates from 16 to 128 kbps/channel. \
 \
The native bitstream format of Vorbis is libogg (Ogg). Alternatively, \
libmatroska (matroska) can also be used."
LICENSE = "BSD-3-Clause"

PV = "1.3.7"

RPM_NAME = "libvorbisfile3-1.3.7-5.10.aarch64.rpm"
RPM_HASH = "15f2c1cb4ef29963284fc256b7115c0b88149f950391353b77216778f559d4ff97b6ecf1c7ed9ff2cd7253a07086b30acdc83586447ddd7a0b93848642354e43"

RPROVIDES:${PN} += "libvorbisfile.so.3 \
libvorbisfile3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libogg.so.0 \
libvorbis.so.0"

inherit rpm
