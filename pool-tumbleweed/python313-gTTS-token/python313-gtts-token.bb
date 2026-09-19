SUMMARY = "Python module for calculating a token to run the Google text-to-speech engine"
DESCRIPTION = "gTTS-token (Google Text to Speech token) is a Python implementation \
of the token validation required by Google Translate when making \
a request to its API."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python313-gTTS-token-1.1.4-3.5.noarch.rpm"
RPM_HASH = "c6efc3c83855a5dfd96b160c415279a236059c4c151dd00556b443e3167a1cdba300c368db9a2bdd1ff02d053234efac350b08bd35090f3a470664feaae6b63f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gTTS-token \
python3.13dist-gtts-token \
python313-gTTS-token \
python3dist-gtts-token"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
