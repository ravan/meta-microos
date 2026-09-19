SUMMARY = "The Next Generation MusicBrainz Tagger"
DESCRIPTION = "MusicBrainz Picard is a MusicBrainz tag editor written in Python. \
Picard Tagger focuses on album-oriented tagging as opposed to \
track-based tagging."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.3"

RPM_NAME = "picard-2.13.3-1.7.aarch64.rpm"
RPM_HASH = "a99503d59de18aca1d5cc6be431a3b8f1ff0c26e8541d4d97f64386f44fd104b4863983e1f7e2f80a3e047b1338554f2d9910b346f26fa491369329eb310214d"

RPROVIDES:${PN} += "picard \
python3.13dist-picard \
python3dist-picard"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python3-Markdown \
python3-PyJWT \
python3-PyQt5 \
python3-PyYAML \
python3-charset-normalizer \
python3-discid \
python3-fasteners \
python3-mutagen \
python3-python-dateutil"

inherit rpm
