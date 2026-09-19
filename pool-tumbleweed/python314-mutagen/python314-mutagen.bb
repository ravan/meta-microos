SUMMARY = "Python module to Handle Audio Metadata"
DESCRIPTION = "Mutagen is a Python module to handle audio metadata. It supports FLAC, \
M4A, MP3, Ogg FLAC, Ogg Speex, Ogg Theora, Ogg Vorbis, True Audio, and \
WavPack audio files. All versions of ID3v2 are supported, and all \
standard ID3v2.4 frames are parsed. It can read Xing headers to \
accurately calculate the bitrate and length of MP3s. ID3 and APEv2 tags \
can be edited regardless of their audio format. It can also manipulate \
Ogg streams on an individual packet/page level."
LICENSE = "GPL-2.0-or-later"

PV = "1.48.1"

RPM_NAME = "python314-mutagen-1.48.1-1.2.noarch.rpm"
RPM_HASH = "0cd06eca3eb7512dfb4eb85f97484725dc3d2f9983b3d9b81beaeeaff5fca144e5b02bcba7ecf7e47224677dc16b3e314c6c2b885110b5afddc27b5e43312a59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mutagen \
python314-mutagen \
python3dist-mutagen"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
