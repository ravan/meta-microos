SUMMARY = "Two-way braille translator"
DESCRIPTION = "liblouis is a translator from and to braille. It features support for \
computer and literary braille, supports contracted and uncontracted \
translation for many languages and has support for hyphenation. New \
languages can be added through tables that support a rule- or \
dictionary-based approach. Math braille (Nemeth and Marburg) is \
supported."
LICENSE = "LGPL-3.0-or-later"

PV = "3.39.0"

RPM_NAME = "liblouis20-3.39.0-1.1.aarch64.rpm"
RPM_HASH = "4825c0d6e69ae820ec86349cd3feb09572afab1f3a1c4e840a410c8edfd9f144842c2a60c235fcbb8c6874f55be49f741e2bc3e6085ca61d8fb563b18acc17c6"

RPROVIDES:${PN} += "liblouis \
liblouis.so.20 \
liblouis20"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblouis-data"

inherit rpm
