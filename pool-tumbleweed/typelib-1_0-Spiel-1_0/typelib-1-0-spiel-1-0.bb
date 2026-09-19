SUMMARY = "Speech synthesis API and framework for free desktops"
DESCRIPTION = "Spiel provides a speech synthesis API for desktop Linux and beyond. \
 \
It consists of two parts, a speech provider interface specification and a client library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.1"

RPM_NAME = "typelib-1_0-Spiel-1_0-1.0.1-2.6.aarch64.rpm"
RPM_HASH = "b0970c8cbe69fadbd4a7cd8f56e2f202f7b394273e163370998e70f72fc30549e3392b96bef15119e6363f6e4e6e4bdd1cd80c0f683292808f1b116a0225fcf8"

RPROVIDES:${PN} += "typelib-1-0-Spiel-1-0 \
typelib-Spiel"

RDEPENDS:${PN} += "libspiel-1.0.so \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
