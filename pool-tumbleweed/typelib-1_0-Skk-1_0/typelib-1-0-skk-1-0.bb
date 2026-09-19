SUMMARY = "Introspection bindings for libskk, a Japanese IME"
DESCRIPTION = "SKK is a statistical language model based Japanese input method engine. \
to model the Japanese language, it use a backoff bigram and trigram \
 \
This package provides the introspection bindings for the libskk library."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.0+git20180916+1.0.5"

RPM_NAME = "typelib-1_0-Skk-1_0-1.2.0+git20180916+1.0.5-2.7.aarch64.rpm"
RPM_HASH = "5cef28a84dd2f6402bbd06614586060a88457b4d5713a753309225f3c578c34f5e6e70498affd89bfec1b1addc2643825d02497d51eb560ff7614dfbebb40234"

RPROVIDES:${PN} += "typelib-1-0-Skk-1-0 \
typelib-Skk"

RDEPENDS:${PN} += "girepository-1-0 \
libskk.so.0 \
typelib-GLib \
typelib-GObject"

inherit rpm
