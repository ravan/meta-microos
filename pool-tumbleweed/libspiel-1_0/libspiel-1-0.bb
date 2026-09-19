SUMMARY = "Speech synthesis API and framework for free desktops"
DESCRIPTION = "Spiel provides a speech synthesis API for desktop Linux and beyond. \
 \
It consists of two parts, a speech provider interface specification and a client library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.1"

RPM_NAME = "libspiel-1_0-1.0.1-2.6.aarch64.rpm"
RPM_HASH = "351b9271f9079f37d383dd6defb99b21bc88a44a41205a746bf4ca7fd8b64247dbff63b482ff77041d4d7d77395cbe6a28ed35447b828e3a55520913f737379d"

RPROVIDES:${PN} += "libspiel-1-0 \
libspiel-1.0.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libspeech-provider-1.0.so"

inherit rpm
