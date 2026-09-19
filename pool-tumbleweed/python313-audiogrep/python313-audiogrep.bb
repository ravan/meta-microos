SUMMARY = "Python package to create audio supercuts"
DESCRIPTION = "Audiogrep transcribes audio files and then creates 'audio supercuts' \
based on search phrases."
LICENSE = "MIT"

PV = "0.1.5"

RPM_NAME = "python313-audiogrep-0.1.5-4.5.noarch.rpm"
RPM_HASH = "c637ad8e1692dc0d5fcd2049e9758340f80289218d2f8ce7072a798e85727a9ab255acd980a57c807bbcb0e85995c83260c12ae953285b68be6d6acd660ebafa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-audiogrep \
python3.13dist-audiogrep \
python313-audiogrep \
python3dist-audiogrep"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
ffmpeg \
pocketsphinx \
python-abi \
python313-pydub"

inherit rpm
