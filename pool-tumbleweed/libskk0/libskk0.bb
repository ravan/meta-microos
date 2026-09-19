SUMMARY = "A statistical language model based Japanese input method engine"
DESCRIPTION = "SKK is a statistical language model based Japanese input method engine. \
to model the Japanese language, it use a backoff bigram and trigram \
 \
This package provides GObject-based library to deal with Japanese \
kana-to-kanji conversion method."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.0+git20180916+1.0.5"

RPM_NAME = "libskk0-1.2.0+git20180916+1.0.5-2.7.aarch64.rpm"
RPM_HASH = "7f77e28db92142136632c953742d742979f5bbe2ce0e2f9e5d4360538a9fa13401a75383e6e250a9aed47b3633397e478e55221352dd21fd721ddcc9f9603a84"

RPROVIDES:${PN} += "libskk.so.0 \
libskk0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libxkbcommon.so.0 \
skkdic \
skkdic-extra"

inherit rpm
