SUMMARY = "Common files for en-US language model support in python-speech_recognition"
DESCRIPTION = "SpeechRecognition Library for performing speech recognition, with support for \
several engines and APIs, online and offline. \
 \
The Speech recognition engine/API supports CMU Sphinx (works offline), Google \
Speech Recognition, Google Cloud Speech API, Wit.ai, Microsoft Bing Voice \
Recognition, Houndify API and IBM Speech to Text. \
 \
This package contains the data for en-US language model to be used by \
pocketsphinx from python-SpeechRecognition."
LICENSE = "BSD-3-Clause"

PV = "3.17.0"

RPM_NAME = "python-SpeechRecognition-common-en-US-3.17.0-1.1.noarch.rpm"
RPM_HASH = "d87eb1b9f1671e9273ff6b2ee36ff4c45769c52a8f4244088c3ca7b8b81b0060a2cf354706189b2db9266079209a97f12a2239db5f8bcbec571a207d4b1ebb0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-SpeechRecognition-common-en-US"

RDEPENDS:${PN} += ""

inherit rpm
