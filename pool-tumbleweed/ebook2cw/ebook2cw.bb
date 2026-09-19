SUMMARY = "Convert ebooks to Morse MP3s/OGGs"
DESCRIPTION = "ebook2cw is a command line program (optional graphical user interface \
available) which converts a plain text (ASCII, ISO 8859-1 or UTF-8) file (e. g. \
an ebook) to Morse code MP3 or OGG audio files."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.5"

RPM_NAME = "ebook2cw-0.8.5-1.6.aarch64.rpm"
RPM_HASH = "80d4ff378a1b93806f33852441a74ef9196c443a6c0b0ab9ebbefda1e810c79ab4abe5f1e3020f34d1632c78d5755ec1885cc26198f8044fc2878200c404cb49"

RPROVIDES:${PN} += "ebook2cw"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
libmp3lame.so.0 \
libogg.so.0 \
libvorbis.so.0 \
libvorbisenc.so.2"

inherit rpm
