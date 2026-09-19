SUMMARY = "Speech synthesis API and framework for free desktops"
DESCRIPTION = "Spiel provides a speech synthesis API for desktop Linux and beyond. \
 \
It consists of two parts, a speech provider interface specification and a client library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.1"

RPM_NAME = "libspeech-provider-1_0-1.0.1-2.6.aarch64.rpm"
RPM_HASH = "cc6cf1c7351e2be27f04bac24be86a5b05d0b1c756c4dd1d67c3069f095a3ce53fe3b1448ea440c327acff8ba792647a80d6dc2b3a481236dfefe849a6fdc638"

RPROVIDES:${PN} += "libspeech-provider-1-0 \
libspeech-provider-1.0.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
