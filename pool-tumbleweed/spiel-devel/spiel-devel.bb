SUMMARY = "Header files for libspiel"
DESCRIPTION = "Spiel provides a speech synthesis API for desktop Linux and beyond. \
 \
It consists of two parts, a speech provider interface specification and a client library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.1"

RPM_NAME = "spiel-devel-1.0.1-2.6.aarch64.rpm"
RPM_HASH = "cb63fff826b4b7ee006464305ef1491fccdd76a15814e2d6ecc2b4cc18d55885398adb795c3f4e66667cda871f3590f5e01a75309c6cf97a6913f60d4164101d"

RPROVIDES:${PN} += "pkgconfig-speech-provider-1.0 \
pkgconfig-spiel-1.0 \
spiel-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspeech-provider-1-0 \
libspiel-1-0 \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0 \
typelib-1-0-SpeechProvider-1-0 \
typelib-1-0-Spiel-1-0"

inherit rpm
