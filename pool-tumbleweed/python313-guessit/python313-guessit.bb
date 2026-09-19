SUMMARY = "A library for guessing information from video files"
DESCRIPTION = "GuessIt is a Python library that extracts as much information as \
possible from a video file. \
It has a filename matcher that allows to guess a lot of metadata from \
a video using its filename only. This matcher works with both movies \
and TV shows episodes."
LICENSE = "LGPL-3.0-or-later"

PV = "4.4.0"

RPM_NAME = "python313-guessit-4.4.0-1.1.noarch.rpm"
RPM_HASH = "306917a351639980bd254f37ab5e16884ec60c0a7b14e0546a0e60478bee895ec8b358e2cb8699194b1b4c40faa572ec5369da5bb75f3d56f822542e11554abd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-guessit \
python3.13dist-guessit \
python313-guessit \
python3dist-guessit"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-babelfish \
python313-python-dateutil \
python313-rebulk"

inherit rpm
