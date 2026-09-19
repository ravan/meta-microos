SUMMARY = "Speech synthesis API and framework for free desktops"
DESCRIPTION = "Spiel provides a speech synthesis API for desktop Linux and beyond. \
 \
It consists of two parts, a speech provider interface specification and a client library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.1"

RPM_NAME = "spiel-1.0.1-2.6.aarch64.rpm"
RPM_HASH = "18a4b48555f3be043aca61e507a6d3aa64d89358902e9fae64e84c72f594f9533daaa94bff3d3dfda61611e0ad5535f3226ea156abf9716db3c9a28a3cb185a8"

RPROVIDES:${PN} += "spiel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libspiel-1.0.so"

inherit rpm
