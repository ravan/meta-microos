SUMMARY = "Development files for the liblouis braille translator"
DESCRIPTION = "liblouis is a translator from and to braille. It features support for \
computer and literary braille, supports contracted and uncontracted \
translation for many languages and has support for hyphenation. New \
languages can be added through tables that support a rule- or \
dictionary-based approach. Math braille (Nemeth and Marburg) is \
supported."
LICENSE = "LGPL-3.0-or-later"

PV = "3.39.0"

RPM_NAME = "liblouis-devel-3.39.0-1.1.aarch64.rpm"
RPM_HASH = "2c3a6c242d5311884b8d8ab664cdb0290b17325f6c083e9814cfea78ff91c23a85b4827dc43628ed80c671718ffc65282a29186cb85acf26115b740ee393d002"

RPROVIDES:${PN} += "liblouis-devel \
pkgconfig-liblouis"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblouis20"

inherit rpm
