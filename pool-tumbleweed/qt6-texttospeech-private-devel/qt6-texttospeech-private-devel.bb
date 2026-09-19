SUMMARY = "Non-ABI stable API for the Qt 6 TextToSpeech library"
DESCRIPTION = "This package provides private headers of libQt6TextToSpeech that do not have \
any ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-texttospeech-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "f465c2dad31e598bc9c892808931b364c72ba40b1b9b3b9d989904d6d45ed86085f99bcd7af1e34b16c4a77bcf94546c2573eabd96c7ec7418f0de1cedc19c43"

RPROVIDES:${PN} += "cmake-Qt6TextToSpeechPrivate \
qt6-texttospeech-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6TextToSpeech"

inherit rpm
