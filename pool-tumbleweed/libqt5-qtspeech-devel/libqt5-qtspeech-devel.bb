SUMMARY = "Development files for the Qt5 Speech library"
DESCRIPTION = "You need this package if you want to compile programs with qtspeech."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde1"

RPM_NAME = "libqt5-qtspeech-devel-5.15.19+kde1-1.2.aarch64.rpm"
RPM_HASH = "9d552b6ac3ee39115e88cf1b3045945508430c56023bef0c46554bc6c2d6967e41e69ff150a279c60c278b89bb9a60101c98569603a84b209d90740b3f547202"

RPROVIDES:${PN} += "cmake-Qt5TextToSpeech \
libqt5-qtspeech-devel \
pkgconfig-Qt5TextToSpeech"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5TextToSpeech5 \
pkgconfig-Qt5Core"

inherit rpm
