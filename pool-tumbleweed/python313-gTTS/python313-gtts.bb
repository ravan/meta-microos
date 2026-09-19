SUMMARY = "Python module to create MP3 files from spoken text via the Google TTS API"
DESCRIPTION = "gTTS is a Python interface for Google's Text to Speech API. An MP3 \
file may be created with the gTTS module or the gtts-cli command line \
utility. It allows unlimited lengths to be spoken by tokenizing long \
sentences where the speech would naturally pause."
LICENSE = "MIT"

PV = "2.5.4"

RPM_NAME = "python313-gTTS-2.5.4-2.5.noarch.rpm"
RPM_HASH = "53d3e4f7edc721519e28d0cc143168e9ee6e93d0091f909a97733344371ad098fcaf321e382d6ca9fbc588b2d1b4e0edaca762a3e5f216593a6a45ab5f48d0f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gTTS \
python3.13dist-gtts \
python313-gTTS \
python3dist-gtts"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-click \
python313-requests \
update-alternatives"

inherit rpm
