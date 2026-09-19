SUMMARY = "French ispell dictionary"
DESCRIPTION = "This package includes a ready French dictionary for ispell. A short \
usage description for ispell is given in \
/usr/share/doc/packages/ispell/README of the package ispell. The \
sources for this dictionary are included in the package dicts."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ispell-french-1.5-426.1.aarch64.rpm"
RPM_HASH = "1047dd11eee51348f6eb6fbb585609ae51f75c286d116375a027735b2e30253385dccbca1e3ab141343a27361da25005d92535834f1c4969ed5396c42f378cad"

RPROVIDES:${PN} += "ifrench \
ispell-dictionary \
ispell-french \
locale-ispell-fr;br-FR"

RDEPENDS:${PN} += ""

inherit rpm
