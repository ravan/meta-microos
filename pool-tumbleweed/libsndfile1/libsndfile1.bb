SUMMARY = "A Library to Handle Various Audio File Formats"
DESCRIPTION = "Libsndfile is a C library for reading and writing sound files, such \
as AIFF, AU, and WAV files, through one standard interface. It can \
currently read and write 8, 16, 24, and 32-bit PCM files as well as \
32-bit floating point WAV files and a number of compressed formats."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.2"

RPM_NAME = "libsndfile1-1.2.2-5.3.aarch64.rpm"
RPM_HASH = "0b83dd354fb7e6a76b63ab4055a33e4496cdec6cd7801cbdaf09d8663d3f7b118f668b91772b53bb235572fa40a436a63d9cd5b3a87f615f767d5ce24967163a"

RPROVIDES:${PN} += "libsndfile \
libsndfile.so.1 \
libsndfile1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libc.so.6 \
libm.so.6 \
libogg.so.0 \
libopus.so.0 \
libvorbis.so.0 \
libvorbisenc.so.2"

inherit rpm
