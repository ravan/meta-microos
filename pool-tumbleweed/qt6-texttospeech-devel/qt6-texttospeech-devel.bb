SUMMARY = "Qt 6 TextToSpeech library - Development files"
DESCRIPTION = "Development files for the Qt 6 TextToSpeech library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-texttospeech-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "f1ec5dba743169f8e55dfc360c3d6fdd13a440a80e9df0e4d7dad2405cd84165af6938c6aa849e420dee31222bc734f6d8b443a80e8887a78ad1b5a68e07a6ba"

RPROVIDES:${PN} += "cmake-Qt6QTextToSpeechFlitePlugin \
cmake-Qt6QTextToSpeechMockPlugin \
cmake-Qt6QTextToSpeechSpeechdPlugin \
cmake-Qt6TextToSpeech \
pkgconfig-Qt6TextToSpeech \
qt6-texttospeech-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6QmlIntegration \
libQt6TextToSpeech6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Multimedia"

inherit rpm
