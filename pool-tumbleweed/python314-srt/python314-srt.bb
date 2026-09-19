SUMMARY = "Python library for handling SRT files, plus tools"
DESCRIPTION = "srt is a Python library for parsing, modifying, and composing SRT files. \
 \
It also includes related tools."
LICENSE = "MIT"

PV = "3.5.3"

RPM_NAME = "python314-srt-3.5.3-1.9.noarch.rpm"
RPM_HASH = "f7563c864c2d94d4a88eed8fd04cb8d6691970b485659c30ca136e2d2450bbed7f18064d5a0ef3a00f38d7f83f2c423e6dfcee27fc311cbf24aa6c287739895c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-srt \
python314-srt \
python3dist-srt"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
