SUMMARY = "Library for performing speech recognition, with support for several engines"
DESCRIPTION = "SpeechRecognition Library for performing speech recognition, with support for several engines and APIs, online and offline. \
 \
The Speech recognition engine/API supports CMU Sphinx (works offline), Google Speech Recognition, \
Google Cloud Speech API, Wit.ai, Microsoft Bing Voice Recognition, Houndify API and \
IBM Speech to Text"
LICENSE = "BSD-3-Clause"

PV = "3.17.0"

RPM_NAME = "python314-SpeechRecognition-3.17.0-1.1.noarch.rpm"
RPM_HASH = "0be7b5d5bd4d5fad40e7671b86dbaeb2af0e23b81eef16a2b22ec22bedcf86bc1cbdfcb3abf4a0acf3011b96df31b32aab26fdccf7813c11e24b470e1a528f6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-speechrecognition \
python314-SpeechRecognition \
python3dist-speechrecognition"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
flac \
python-SpeechRecognition-common-en-US \
python-abi \
python314-PyAudio \
python314-audioop-lts \
python314-google-cloud-speech \
python314-standard-aifc \
python314-typing-extensions"

inherit rpm
