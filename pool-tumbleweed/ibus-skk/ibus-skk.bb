SUMMARY = "Japanese SKK input method for ibus"
DESCRIPTION = "A Japanese Simple Kana Kanji Input Method Engine for ibus."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.3"

RPM_NAME = "ibus-skk-1.4.3-4.5.aarch64.rpm"
RPM_HASH = "694822599c4a31e9bb36144fc8e4b1a236de6ec16fad7a39bc0d92c94d742166534caa5e53f78902b13ee305cec1850a61b8f38dfcada461b1e3d97d2b7aa1b4"

RPROVIDES:${PN} += "ibus-skk"

RDEPENDS:${PN} += "ibus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libibus-1.0.so.5 \
libskk.so.0"

inherit rpm
