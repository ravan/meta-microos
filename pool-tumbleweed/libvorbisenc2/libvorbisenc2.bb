SUMMARY = "The Vorbis General Audio Compression Codec"
DESCRIPTION = "Vorbis is a fully open, nonproprietary, patent-and-royalty-free, and \
general-purpose compressed audio format for audio and music at fixed \
and variable bit rates from 16 to 128 kbps/channel. \
 \
The native bitstream format of Vorbis is libogg (Ogg). Alternatively, \
libmatroska (matroska) can also be used."
LICENSE = "BSD-3-Clause"

PV = "1.3.7"

RPM_NAME = "libvorbisenc2-1.3.7-5.10.aarch64.rpm"
RPM_HASH = "9458285065a3aa8820db8400c320b6fd072dffe7fbf0f139df82f49c8e299aac447a300fe5c3ee464a54128ece849766ba449047636aab05196d97ef9ed72aa6"

RPROVIDES:${PN} += "libvorbisenc.so.2 \
libvorbisenc2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libvorbis.so.0"

inherit rpm
