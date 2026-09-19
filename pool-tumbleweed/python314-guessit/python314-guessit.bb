SUMMARY = "A library for guessing information from video files"
DESCRIPTION = "GuessIt is a Python library that extracts as much information as \
possible from a video file. \
It has a filename matcher that allows to guess a lot of metadata from \
a video using its filename only. This matcher works with both movies \
and TV shows episodes."
LICENSE = "LGPL-3.0-or-later"

PV = "4.4.0"

RPM_NAME = "python314-guessit-4.4.0-1.1.noarch.rpm"
RPM_HASH = "b62d1011347d292ae950e6921d121f8837a57e9bd5fc7e47ed62376675b76607cca7207b92ec804decdae49b5dfba9cfa843bedce3982d052b06ad987b08f651"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-guessit \
python314-guessit \
python3dist-guessit"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-babelfish \
python314-python-dateutil \
python314-rebulk"

inherit rpm
