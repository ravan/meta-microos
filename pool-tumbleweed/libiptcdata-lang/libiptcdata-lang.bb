SUMMARY = "Translations for package libiptcdata"
DESCRIPTION = "Provides translations for the 'libiptcdata' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "libiptcdata-lang-1.0.5-1.20.noarch.rpm"
RPM_HASH = "5f06bdcec1083c5a30720215ec3431e6317e7d3171edf6ac1e6fdc68ca99d29a8d742a41fb906ba4c3b9651a1aea6fac2d8f6c2c8d3085eb17fb299b452b4e49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libiptcdata-lang \
libiptcdata-lang-all \
locale-libiptcdata-de \
locale-libiptcdata-it"

RDEPENDS:${PN} += "libiptcdata"

inherit rpm
