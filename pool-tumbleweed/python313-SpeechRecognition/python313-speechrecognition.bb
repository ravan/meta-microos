SUMMARY = "Library for performing speech recognition, with support for several engines"
DESCRIPTION = "SpeechRecognition Library for performing speech recognition, with support for several engines and APIs, online and offline. \
 \
The Speech recognition engine/API supports CMU Sphinx (works offline), Google Speech Recognition, \
Google Cloud Speech API, Wit.ai, Microsoft Bing Voice Recognition, Houndify API and \
IBM Speech to Text"
LICENSE = "BSD-3-Clause"

PV = "3.17.0"

RPM_NAME = "python313-SpeechRecognition-3.17.0-1.1.noarch.rpm"
RPM_HASH = "be6d20609190d56bfdf5af7310d8ae292ec4b7e5d707999caca6c4148d7797f5297cf1494ea2f54aff604ca068fd2790fbd01b96b58e95b0fd2fe0f34edf260c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-SpeechRecognition \
python3.13dist-speechrecognition \
python313-SpeechRecognition \
python3dist-speechrecognition"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
flac \
python-SpeechRecognition-common-en-US \
python-abi \
python313-PyAudio \
python313-audioop-lts \
python313-google-cloud-speech \
python313-standard-aifc \
python313-typing-extensions"

inherit rpm
