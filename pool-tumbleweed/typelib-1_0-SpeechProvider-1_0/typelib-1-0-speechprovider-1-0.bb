SUMMARY = "Speech synthesis API and framework for free desktops"
DESCRIPTION = "Spiel provides a speech synthesis API for desktop Linux and beyond. \
 \
It consists of two parts, a speech provider interface specification and a client library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.1"

RPM_NAME = "typelib-1_0-SpeechProvider-1_0-1.0.1-2.6.aarch64.rpm"
RPM_HASH = "ab5329313647e47e73172480fd8e81282c6e073931c3371255dca7b88e80934e0e5509f3191d77d1f593739b1d268b8864f7b60f27a939c0c9fc968c76836308"

RPROVIDES:${PN} += "typelib-1-0-SpeechProvider-1-0 \
typelib-SpeechProvider"

RDEPENDS:${PN} += "libspeech-provider-1.0.so \
typelib-GLib \
typelib-GObject"

inherit rpm
