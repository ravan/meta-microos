SUMMARY = "Python package to create audio supercuts"
DESCRIPTION = "Audiogrep transcribes audio files and then creates 'audio supercuts' \
based on search phrases."
LICENSE = "MIT"

PV = "0.1.5"

RPM_NAME = "python314-audiogrep-0.1.5-4.5.noarch.rpm"
RPM_HASH = "907e4f2c4de5448f5394e9c6b6c316f92a9ba79b409975a77b58102dedc37f11d9d1dc44da8e7d70c910d4e0bae4763e6996a7650cf3bd263abaaef795bc9299"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-audiogrep \
python314-audiogrep \
python3dist-audiogrep"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
ffmpeg \
pocketsphinx \
python-abi \
python314-pydub"

inherit rpm
