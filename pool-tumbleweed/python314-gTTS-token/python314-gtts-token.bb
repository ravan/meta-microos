SUMMARY = "Python module for calculating a token to run the Google text-to-speech engine"
DESCRIPTION = "gTTS-token (Google Text to Speech token) is a Python implementation \
of the token validation required by Google Translate when making \
a request to its API."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python314-gTTS-token-1.1.4-3.5.noarch.rpm"
RPM_HASH = "e1ab35e0e406194f754e568a4c8bc47bf5689500a38f4240cc99533b927255063d8226e26a41dbb539873ee26d2086b695199979ef3a06f9965cec3078753992"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gtts-token \
python314-gTTS-token \
python3dist-gtts-token"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
