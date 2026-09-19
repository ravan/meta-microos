SUMMARY = "Japanese Kana-string to Kana-Kanji-mixed-string convertion library"
DESCRIPTION = "libkkc provides a converter from Japanese Kana-string to Kana-Kanji-mixed-string. \
It was named after kkc.el in GNU Emacs, a simple Kana Kanji converter, \
while libkkc tries to convert sentences in a bit more complex way using N-gram \
language models."
LICENSE = "GPL-3.0-only"

PV = "0.3.6~git20240902.ce17a35"

RPM_NAME = "libkkc2-0.3.6~git20240902.ce17a35-4.3.aarch64.rpm"
RPM_HASH = "2e19ee1f2e5bee4f09185d8948ab8a0bbbc720156fceb793f7d5578e630c40512c14c8aafb892bda3806ac7aab5b7e639ddaf06a0ec9f9177aff1909914de2c8"

RPROVIDES:${PN} += "libkkc.so.2 \
libkkc2"

RDEPENDS:${PN} += "/sbin/ldconfig \
kkc-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libmarisa.so.0 \
skkdic \
skkdic-extra"

inherit rpm
