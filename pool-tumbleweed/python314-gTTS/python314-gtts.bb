SUMMARY = "Python module to create MP3 files from spoken text via the Google TTS API"
DESCRIPTION = "gTTS is a Python interface for Google's Text to Speech API. An MP3 \
file may be created with the gTTS module or the gtts-cli command line \
utility. It allows unlimited lengths to be spoken by tokenizing long \
sentences where the speech would naturally pause."
LICENSE = "MIT"

PV = "2.5.4"

RPM_NAME = "python314-gTTS-2.5.4-2.5.noarch.rpm"
RPM_HASH = "9056d96f2a939d1c2c2d0c0ab7910ac4845ccb549c1758be0aa0f6fd1f3b27a3c420fd37eddd301d4b4f01c4a3fc1e48ba6706ce8fba4bac54def87164f41b44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gtts \
python314-gTTS \
python3dist-gtts"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-click \
python314-requests \
update-alternatives"

inherit rpm
