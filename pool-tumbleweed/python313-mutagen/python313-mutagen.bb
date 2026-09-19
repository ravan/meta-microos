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

RPM_NAME = "python313-mutagen-1.48.1-1.2.noarch.rpm"
RPM_HASH = "4f1b92e3b057598a293ab3501d81948e56f010691d8af538ae3f592634894dbf7b0beafe95dec99e740cbc5d4872b8150453110d589c966077caf2b2edd077de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mutagen \
python3.13dist-mutagen \
python313-mutagen \
python3dist-mutagen"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
