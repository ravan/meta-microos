SUMMARY = "Qt 6 TextToSpeech library"
DESCRIPTION = "The QTextToSpeech class provides a convenient access to text-to-speech engines."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6TextToSpeech6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "3b7d21a3ae9d86e868e136f23198830f388d459e3f75d09313fae939eec869fc2d5d84249af1cecc145fe6ffdfa78cf7d45ea1a715e587bdd95168ca4ea7cf8d"

RPROVIDES:${PN} += "libQt6TextToSpeech.so.6 \
libQt6TextToSpeech6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Multimedia.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-texttospeech"

inherit rpm
